package com.example.myapplication14;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;


public class AddCarFragment extends Fragment {
    private EditText etName , etLocation ,etPhone ,etNumPlate , etCategory;
    private Button btnAdd ;
    private FirebaseServices fbs ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public void onStart(){
        super.onStart();
        connectComponents();
    }
    public void connectComponents()
    {
        etName =getActivity().findViewById(R.id.etNameAddCarFragment);
        etLocation = getActivity().findViewById(R.id.etLocationAddCarFragment);
        etPhone= getActivity().findViewById(R.id.etPhoneAddCarFragment);
        etNumPlate=getActivity().findViewById(R.id.etNumPlateAddCarFragment);
        etCategory = getActivity().findViewById(R.id.etCategoryAddCarFragment);
        fbs = FirebaseServices.getInstance();
        btnAdd = getActivity().findViewById(R.id.btnAddAddCarFragment);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name,location,phone,numberplate,category;
                name = etName.getText().toString();
                location = etLocation.getText().toString();
                phone = etPhone.getText().toString();
                numberplate = etNumPlate.getText().toString();
                category = etCategory.getText().toString();
                if (name.trim().isEmpty() || location.trim().isEmpty() || phone.trim().isEmpty() || numberplate.trim().isEmpty() || category.trim().isEmpty()){
                    Toast.makeText(getActivity(), "some fields are empty!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Car car = new Car(name,location,phone,,category,"");

                fbs.getFire().collection("cars").add(car).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_car, container, false);
    }
}