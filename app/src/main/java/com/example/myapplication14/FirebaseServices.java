package com.example.myapplication14;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices {
    private static FirebaseServices instance ;
    private FirebaseAuth auth ;
    private FirebaseStorage storage ;
    private FirebaseFirestore fire ;
    public static FirebaseServices getInstance(){
        if (instance == null)
            instance = new FirebaseServices();
        return instance ;
    }
    public FirebaseAuth getAuth(){
        return auth;
    }
    public FirebaseFirestore getFire(){
        return fire ;
    }
    public FirebaseStorage getStorage(){
        return storage ;
    }

    public FirebaseServices(){
        this.auth = auth ;
        this.fire = fire ;
        this.storage = storage ;
    }
}
