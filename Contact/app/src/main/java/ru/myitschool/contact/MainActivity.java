package ru.myitschool.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestContactsPermission();

         textView = findViewById(R.id.textView);

        ArrayList<DisplayingContact> contactsArrayList = new ArrayList<>();
        fillContactsArrayList(contactsArrayList);
        for (DisplayingContact displayingContact : contactsArrayList){
            String contactDescription =
                    "Contact Name" + displayingContact.name + "\n" +
                            "Contact phone number" + displayingContact.phoneNumber.get(0) + "\n" +
                            "\n";
            textView.setText(textView.getText()+ contactDescription);
        }
        System.out.println();
    }

    private void fillContactsArrayList(ArrayList<DisplayingContact> contactsArrayList) {
        ContentResolver contentResolver = getContentResolver();
        Cursor contactsCursor = contentResolver.query(
                ContactsContract.Contacts.CONTENT_URI,
                null, null, null, null, null
        );
        if (contactsCursor != null) {
            while (contactsCursor.moveToNext()) {
                int nameColumnIndex = contactsCursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
                int hasPhoneNumberIndex = contactsCursor.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER);
                int contactIdIndex = contactsCursor.getColumnIndex(ContactsContract.Contacts._ID);
                if (nameColumnIndex >= 0 && hasPhoneNumberIndex >= 0) {
                    String contactName = contactsCursor.getString(nameColumnIndex);
                    Boolean hasPhoneNumber = contactsCursor.getInt(hasPhoneNumberIndex) == 1;
                    Integer contactId = contactsCursor.getInt(contactIdIndex);

                    Cursor phoneCursor = getContentResolver().query(
                            ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                            null,
                            ContactsContract.CommonDataKinds.Phone.CONTACT_ID +"="+contactId,
                            null,
                            null
                    );
                    ArrayList<String> contactPhoneNumbers = new ArrayList<String>();
                     if (phoneCursor!=null){
                         while(phoneCursor.moveToNext()){
                             int phoneNumberIndex = phoneCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);

                             if(hasPhoneNumberIndex>=0){
                                 String phoneNumber =phoneCursor.getString(phoneNumberIndex);
                                 contactPhoneNumbers.add(phoneNumber);
                             }
                         }
                     }
                     contactsArrayList.add(
                             new DisplayingContact(
                                 contactName,
                                 contactPhoneNumbers
                             )
                     );
                }
            }
            contactsCursor.close();
        }
    }

    private void requestContactsPermission() {
        if (this.checkSelfPermission(Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    this,
                    new String[]{Manifest.permission.READ_CONTACTS},
                    1
            );
        }
    }
}