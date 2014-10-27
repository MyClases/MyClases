package com.example.user.myclases.data;

import android.provider.BaseColumns;

/**
 * Created by Diego on 22-10-2014.
 */
public class MyProfeContract {
    public static final class MyProfeEntry implements BaseColumns {

        public static final String TABLE_NAME="Usuarios";

        public static final String COLUMN_LOGIN="Login";

        public static final String COLUMN_CLAVE="Clave";

        public static final String COLUMN_COMUNA="Comuna";

        public static final String COLUMN_INFOPERFIL="InfoPerfil";
    }

    public static final class MyProfeEntry2 implements BaseColumns {

        public static final String TABLE_NAME2="Asignatura";

        public static final String COLUMN_ASIGNATURA="Asignatura";

        public static final String COLUMN_CURSO="Curso";
    }

    public static final class MyProfeEntry3 implements BaseColumns {

        public static final String TABLE_NAME3 = "Profesores";

        public static final String COLUMN_PRECIO = "Precio";

        public static final String COLUMN_GRADOACADEMICO = "GradoAcademico";

        public static final String COLUMN_USUARIOSKEY = "IDUsuario";

        public static final String COLUMN_ASIGNATURAKEY = "IDAsignatura";
    }

    public static final class MyProfeEntry4 implements BaseColumns {

        public static final String TABLE_NAME4="Alumnos";

        public static final String COLUMN_USUARIOSKEY = "IDUsuario";

        public static final String COLUMN_ASIGNATURAKEY = "IDAsignatura";
    }
}
