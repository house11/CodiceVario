 private static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 0;
    private static final String TAG = "..";
    private static String[] PERMISSIONS_CONTACT = {Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_CONTACTS};
    

    private static final int REQUEST_CONTACTS = 1;

 private void fn_permissionWrite() {


        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, MY_PERMISSIONS_REQUEST_READ_CONTACTS);

        } else {
            runProgramma();

        }


    }

    private void fn_permissionRubrica() {
        
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS)
                != PackageManager.PERMISSION_GRANTED
                || ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_CONTACTS)
                != PackageManager.PERMISSION_GRANTED) {
            

           
            Log.e(TAG, "Contact permissions has NOT been granted. Requesting permissions.");
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_CONTACTS}, REQUEST_CONTACTS);

        } else {
           
            Log.i(TAG,
                    "Contact permissions have already been granted. Displaying contact details.");
            
        }
    }

    private void fn_permissionGps() {


        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) ==
                PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) ==
                        PackageManager.PERMISSION_GRANTED) {


            ActivityCompat.requestPermissions(this, new String[]{
                            Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.ACCESS_COARSE_LOCATION},
                    255);
        } else {Log.i(TAG,
                "Contact permissions have already been granted. Displaying contact details."); }


    }

    private void fn_permissionSms() {


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            
            Log.e(TAG, "Contact permissions has NOT been granted. Requesting permissions.");
            ActivityCompat.requestPermissions(MainActivity.this, PERMISSIONS_SMS, 4);

        } else {
            
            Log.i(TAG,
                    "Contact permissions have already been granted. Displaying contact details.");
            
        }

    }