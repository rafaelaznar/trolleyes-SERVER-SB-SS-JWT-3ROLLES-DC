/*
 * Copyright (c) 2021
 *
 * by Rafael Angel Aznar Aparici (rafaaznar at gmail dot com) & DAW students
 *
 * TROLLEYES: Free Open Source Shopping Site
 *
 * Sources at:                https://github.com/rafaelaznar
 *
 * TROLLEYES is distributed under the MIT License (MIT)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.ausiasmarch.trolleyesSBserverJWT.service;

import java.time.ZoneId;
import java.util.Optional;
import net.ausiasmarch.trolleyesSBserverJWT.entity.CompraEntity;
import net.ausiasmarch.trolleyesSBserverJWT.entity.FacturaEntity;
import net.ausiasmarch.trolleyesSBserverJWT.entity.ProductoEntity;
import net.ausiasmarch.trolleyesSBserverJWT.entity.TipoproductoEntity;
import net.ausiasmarch.trolleyesSBserverJWT.entity.TipousuarioEntity;
import net.ausiasmarch.trolleyesSBserverJWT.entity.UsuarioEntity;
import net.ausiasmarch.trolleyesSBserverJWT.helper.RandomHelper;
import net.ausiasmarch.trolleyesSBserverJWT.repository.CompraRepository;
import net.ausiasmarch.trolleyesSBserverJWT.repository.FacturaRepository;
import net.ausiasmarch.trolleyesSBserverJWT.repository.ProductoRepository;
import net.ausiasmarch.trolleyesSBserverJWT.repository.TipoproductoRepository;
import net.ausiasmarch.trolleyesSBserverJWT.repository.TipousuarioRepository;
import net.ausiasmarch.trolleyesSBserverJWT.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FillService {

    @Autowired
    TipoproductoRepository oTipoproductoRepository;

    @Autowired
    ProductoRepository oProductoRepository;

    @Autowired
    CompraRepository oCompraRepository;

    @Autowired
    TipousuarioRepository oTipousuarioRepository;

    @Autowired
    UsuarioRepository oUsuarioRepository;

    @Autowired
    FacturaRepository oFacturaRepository;

    public String getProducto01c() {
        String nombre = "";
        switch (RandomHelper.getRandomInt(1, 10)) {
            case 1:
                nombre = "Productos";
                break;
            case 2:
                nombre = "Accesorios";
                break;
            case 3:
                nombre = "Herramientas";
                break;
            case 4:
                nombre = "Art??culos";
                break;
            case 5:
                nombre = "Aperajes";
                break;
            case 6:
                nombre = "Instrumentos";
                break;
            case 7:
                nombre = "Complementos";
                break;
            case 8:
                nombre = "Recambios";
                break;
            case 9:
                nombre = "Mercanc??as";
                break;
            case 10:
                nombre = "Suplementos";
                break;
        }
        return nombre;
    }

    public String getProducto01p() {
        String nombre = "";
        switch (RandomHelper.getRandomInt(1, 10)) {
            case 1:
                nombre = "Difusor";
                break;
            case 2:
                nombre = "Adaptador";
                break;
            case 3:
                nombre = "Pompa";
                break;
            case 4:
                nombre = "Porcelana";
                break;
            case 5:
                nombre = "Radiador";
                break;
            case 6:
                nombre = "Bater??a";
                break;
            case 7:
                nombre = "Repetidor";
                break;
            case 8:
                nombre = "Base";
                break;
            case 9:
                nombre = "Cartucho";
                break;
            case 10:
                nombre = "Cable";
                break;
        }
        return nombre;
    }

    public String getProducto02() {
        String nombre = "";
        switch (RandomHelper.getRandomInt(1, 9)) {
            case 1:
                nombre += " de limpieza";
                break;
            case 2:
                nombre += " de reaparaci??n";
                break;
            case 3:
                nombre += " de puesta a punto";
                break;
            case 4:
                nombre += " de servicio";
                break;
            case 5:
                nombre += " de asistencia";
                break;
            case 6:
                nombre += " de apoyo";
                break;
            case 7:
                nombre += " de franqueo";
                break;
            case 8:
                nombre += " de refuerzo";
                break;
            case 9:
                nombre += " de protecci??n";
                break;
        }
        return nombre;
    }

    public String getProducto03() {
        String nombre = "";
        switch (RandomHelper.getRandomInt(1, 7)) {
            case 1:
                nombre += " de hogar";
                break;
            case 2:
                nombre += " de automoci??n";
                break;
            case 3:
                nombre += " de joyer??a";
                break;
            case 4:
                nombre += " de moda";
                break;
            case 5:
                nombre += " de jard??n";
                break;
            case 6:
                nombre += " de juguetes";
                break;
            case 7:
                nombre += " de electr??nica";
                break;
        }
        return nombre;
    }

    public String getProducto04() {
        String nombre = "";
        switch (RandomHelper.getRandomInt(1, 9)) {
            case 1:
                nombre += " para amantes del cine";
                break;
            case 2:
                nombre += " para mascotas";
                break;
            case 3:
                nombre += " industrial";
                break;
            case 4:
                nombre += " para el bricolage";
                break;
            case 5:
                nombre += " para la purificaci??n";
                break;
            case 6:
                nombre += " de amplio espectro";
                break;
            case 7:
                nombre += " de primera categor??a";
                break;
            case 8:
                nombre += " de alta granularidad";
                break;
            case 9:
                nombre += " resistente al agua";
                break;
        }
        return nombre;
    }

    private String getProductoLast() {
        String nombre = "";
        switch (RandomHelper.getRandomInt(1, 21)) {

            case 1:
                nombre += " de color negro";
                break;
            case 2:
                nombre += " de color blanco";
                break;
            case 3:
                nombre += " de color gris";
                break;
            case 4:
                nombre += " de color verde";
                break;
            case 5:
                nombre += " de color rojo";
                break;
            case 6:
                nombre += " de color azul";
                break;
            case 7:
                nombre += " de color amarillo";
                break;
            case 8:
                nombre += " de color marr??n";
                break;
            case 9:
                nombre += " de color rosa";
                break;
            case 10:
                nombre += " polivalente";
                break;
            case 11:
                nombre += " ambivalente";
                break;
            case 12:
                nombre += " vers??til";
                break;
            case 13:
                nombre += " adaptable";
                break;
            case 14:
                nombre += " variable";
                break;
            case 15:
                nombre += " oscilante";
                break;
            case 16:
                nombre += " basculante";
                break;
            case 17:
                nombre += " robusto";
                break;
            case 18:
                nombre += " super eficiente";
                break;
            case 19:
                nombre += " ultra potente";
                break;
            case 20:
                nombre += " din??mico";
                break;
            case 21:
                nombre += " consistente";
                break;
        }
        return nombre;
    }

    public Long tipoproductoFill(Long cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            TipoproductoEntity oTipoproductoEntity = new TipoproductoEntity();
            oTipoproductoEntity.setNombre(this.getProducto01c() + this.getProducto02() + this.getProducto03() + this.getProducto04());
            oTipoproductoRepository.save(oTipoproductoEntity);
        }
        return cantidad;
    }

    public Long productoFill(Long cantidad) {
        for (int i = 1; i <= cantidad; i++) {
            ProductoEntity oProductoEntity = new ProductoEntity();
            oProductoEntity.setCodigo(RandomHelper.getRandomHexString(RandomHelper.getRandomInt(5, 10)).toUpperCase());
            oProductoEntity.setDescuento(RandomHelper.getRandomInt(0, 3));
            oProductoEntity.setExistencias(RandomHelper.getRandomInt(0, 1000));
            oProductoEntity.setNombre(this.getProducto01p() + this.getProducto02() + this.getProducto03() + this.getProductoLast());
            Optional<TipoproductoEntity> optionalTipoproductoEntity = oTipoproductoRepository.findById(Long.valueOf(RandomHelper.getRandomInt(1, 100)));
            TipoproductoEntity oTipoproductoEntity = optionalTipoproductoEntity.get();
            oProductoEntity.setTipoproducto(oTipoproductoEntity);
            oProductoEntity.setImagen(1L);
            oProductoEntity.setPrecio(RandomHelper.getRadomDouble(1, 3000));
            oProductoRepository.save(oProductoEntity);
        }
        return cantidad;
    }

    public Long tipousuarioFill() {

        TipousuarioEntity oTipousuarioEntity = new TipousuarioEntity();
        oTipousuarioEntity.setNombre("Administrador");
        oTipousuarioRepository.save(oTipousuarioEntity);

        oTipousuarioEntity = new TipousuarioEntity();
        oTipousuarioEntity.setNombre("Cliente");
        oTipousuarioRepository.save(oTipousuarioEntity);

        return 2L;

    }

    public Long usuarioFill(Long cantidad) {

        String[] nombres = {"Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
            "Bartolom??", "Baruc", "Baruj", "Candelaria", "C??ndida", "Canela", "Caridad", "Carina", "Carisa",
            "Caritina", "Carlota", "Baltazar"};
        String[] apellidos = {"Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
            "Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
            "Grigalva"};

        for (int i = 1; i <= cantidad; i++) {

            UsuarioEntity oUsuarioEntity = new UsuarioEntity();

            oUsuarioEntity.setDni(String.valueOf(RandomHelper.getRandomInt(11111111, 99999999) + String.valueOf(RandomHelper.getRadomChar()).toUpperCase()));
            String nombre = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))];
            String apellido1 = apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
            String apellido2 = apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
            oUsuarioEntity.setNombre(nombre);
            oUsuarioEntity.setApellido1(apellido1);
            oUsuarioEntity.setApellido2(apellido2);
            //Maybe esta bien
            oUsuarioEntity.setLogin(nombre.substring(0, 2).toLowerCase() + apellido1.substring(0, 2).toLowerCase() + apellido2.substring(0, 2).toLowerCase() + String.valueOf(RandomHelper.getRandomInt(1, 10)));
            oUsuarioEntity.setPassword("da8ab09ab4889c6208116a675cad0b13e335943bd7fc418782d054b32fdfba04");
            oUsuarioEntity.setEmail(nombre + apellido1.charAt(0) + "@ausiasmarch.net");
            oUsuarioEntity.setDescuento(0);
            TipousuarioEntity oTipousuarioEntity = new TipousuarioEntity();
            oTipousuarioEntity.setId(2L);
            oUsuarioEntity.setTipousuario(oTipousuarioEntity);
            oUsuarioEntity.setToken("");
            oUsuarioEntity.setValidado(true);
            oUsuarioEntity.setActivo(true);

            oUsuarioRepository.save(oUsuarioEntity);
        }
        return cantidad;
    }

    public Long compraFill(Long cantidad) {

        for (int i = 1; i <= cantidad; i++) {
            CompraEntity oCompraEntity = new CompraEntity();
            oCompraEntity.setCantidad(RandomHelper.getRandomInt(1, 5));
            oCompraEntity.setPrecio(RandomHelper.getRadomDouble(1, 200));
            oCompraEntity.setFecha(RandomHelper.getRadomDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
            oCompraEntity.setDescuento_usuario(RandomHelper.getRandomInt(0, 2));
            oCompraEntity.setDescuento_producto(RandomHelper.getRandomInt(0, 2));
            Optional<FacturaEntity> optionalFacturaEntity = oFacturaRepository.findById(Long.valueOf(RandomHelper.getRandomInt(1, 100)));
            FacturaEntity oFacturaEntity = optionalFacturaEntity.get();
            oCompraEntity.setFactura(oFacturaEntity);
            Optional<ProductoEntity> optionalProductoEntity = oProductoRepository.findById(Long.valueOf(RandomHelper.getRandomInt(1, 100)));
            ProductoEntity oProductoEntity = optionalProductoEntity.get();
            oCompraEntity.setProducto(oProductoEntity);
            oCompraRepository.save(oCompraEntity);
        }
        return cantidad;
    }

    public Long facturaFill(Long cantidad) {

        int[] ivas = {4, 10, 21};

        for (int i = 1; i <= cantidad; i++) {
            int iva = ivas[(int) (Math.floor(Math.random() * ((ivas.length - 1) - 0 + 1) + 0))];
            FacturaEntity oFacturaEntity = new FacturaEntity();
            oFacturaEntity.setFecha(RandomHelper.getRadomDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
            oFacturaEntity.setIva(iva);
            Optional<UsuarioEntity> optionalUsuarioEntity = oUsuarioRepository.findById(Long.valueOf(RandomHelper.getRandomInt(1, 100)));
            UsuarioEntity oUsuarioEntity = optionalUsuarioEntity.get();
            oFacturaEntity.setUsuario(oUsuarioEntity);
            oFacturaEntity.setPagado(true);
            oFacturaRepository.save(oFacturaEntity);
        }
        return cantidad;

    }

}
