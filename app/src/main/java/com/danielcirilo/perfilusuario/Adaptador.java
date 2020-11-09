package com.danielcirilo.perfilusuario;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Adaptador extends FragmentPagerAdapter {
    public Adaptador(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        User user = new User("Daniel","Cirilo","07/07/2001","Denia,la pedrera","939329",
                "daniel@gmail.com","123456","ciriloman","www.cirilolman.com","22222","Danielon");

        switch (position){
            case 0:
                FragmentPersonal fragmentPersonal = new FragmentPersonal(user);
                return fragmentPersonal;
            case 1:
                FragmentProfesional fragmentProfesional = new FragmentProfesional(user);
                return fragmentProfesional;
            case 2:
               FragmentContrasenya fragmentContrasenya = new  FragmentContrasenya(user);
               return  fragmentContrasenya;
            default:
                return null;


        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
