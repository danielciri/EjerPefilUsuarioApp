package com.danielcirilo.perfilusuario;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentPersonal extends Fragment {
    private User user;

    public FragmentPersonal(User user) {
        this.user = user;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_personal,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView nombre = getView().findViewById(R.id.tvNombre);
        TextView tvApellido = getView().findViewById(R.id.tvApellido);
        TextView tvFechaNac = getView().findViewById(R.id.tvFechaNac);
        TextView tvDireccion = getView().findViewById(R.id.tvDirecc);
        TextView tvNif = getView().findViewById(R.id.tvNif);
        nombre.setText(user.getName());
        tvApellido.setText( user.getApellido());
        tvFechaNac.setText( user.getFechaNacimiento());
        tvDireccion.setText(user.getDireccion());
        tvNif.setText(user.getNif());



    }

}
