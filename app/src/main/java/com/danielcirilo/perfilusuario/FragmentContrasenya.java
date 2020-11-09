package com.danielcirilo.perfilusuario;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;

public class FragmentContrasenya extends Fragment {
    private User user;
    private Button cambioContrasenya;
    private Button guardarCambios;
    private EditText contrasenyaActual;
    private EditText nuevaContrasenya;
    private EditText confirmaContrasenya;
    private LinearLayout linearLayout;
    public FragmentContrasenya(User user) {
        this.user = user;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contra,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView tvUsername = getView().findViewById(R.id.tvUsername);
        tvUsername.setText(user.getUserName());
        contrasenyaActual = getView().findViewById(R.id.ticontraNueva);
        nuevaContrasenya = getView().findViewById(R.id.ticontraNueva);
        confirmaContrasenya = getView().findViewById(R.id.ticontraConfirma);
        cambioContrasenya = getView().findViewById(R.id.btCambioContra);
        linearLayout = getView().findViewById(R.id.linearContra);
        guardarCambios = getView().findViewById(R.id.btGuardarCambios);
        String strContrasenyaActual = contrasenyaActual.getText().toString();
        String stcontrasenya = nuevaContrasenya.getText().toString();
        final String stcontrasenyaConfirma = confirmaContrasenya.getText().toString();
        cambioContrasenya.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.VISIBLE);
            }

        });
        if(strContrasenyaActual.equalsIgnoreCase(user.getContrasena())){
            if(stcontrasenya.equalsIgnoreCase(stcontrasenyaConfirma)){
                guardarCambios.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        user.setContrasena(stcontrasenyaConfirma);
                        Toast.makeText(getActivity(),"Contrasenya cambia ",Toast.LENGTH_LONG).show();
                    }
                });
            }else {
                confirmaContrasenya.setError("No coinciden las contrasenyas");
            }
        }else{
          contrasenyaActual.setError("Contrasena invalida");
        }

    }

}
