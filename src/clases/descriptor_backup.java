/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author megan
 */
public class descriptor_backup {
    String nombre_simbolico;
    Date fecha_creacion;
    String usuario_creacion;
    Date fecha_modificacion;
    String usuario_modificacion;
    int no_registros;

    public descriptor_backup(String nombre_simbolico, Date fecha_creacion, String usuario_creacion, Date fecha_modificacion, String usuario_modificacion, int no_registros) {
        this.nombre_simbolico = nombre_simbolico;
        this.fecha_creacion = fecha_creacion;
        this.usuario_creacion = usuario_creacion;
        this.fecha_modificacion = fecha_modificacion;
        this.usuario_modificacion = usuario_modificacion;
        this.no_registros = no_registros;
    }
    
    
    
}
