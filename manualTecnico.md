# Manual Tecnico

_Implementacion de una matriz Ortogonal_

_se trabajo en tres capas este proyecto_

- Modelo
- Servicio
- Vista

##

### Modelo

_Es esta parte se implemento una clase llamada Nodo parqueo_

```java
public class NodoVehiculo {
    Vehiculo vehiculo;
    NodoVehiculo arriba;
    NodoVehiculo abajo;
    NodoVehiculo izquierda;
    NodoVehiculo derecha;

    public NodoVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        arriba = null;
        abajo = null;
        izquierda = null;
        derecha = null;
    }


}

```

_aca se crearon los punteros y el contructor de dicha clase_

_La siguiente clase llamada Parqueo Espacio_

_define la placa , un valor logico boolean para verificar si ya esta ocupado o no , y el Jpanel_

_de igual manera esta clase cuenta con su contructor y sus gettters y setters_

```java
public class ParqueoEspacio {
    private String placa;
    private boolean ocupado;
    private JPanel panel;

    public ParqueoEspacio(String nombre, JPanel panel) {
        this.placa = nombre;
        this.ocupado = false;
        this.panel = panel;
    }
}
```

_En la siguiente clase Parqueo Modelo_

_Esta clase muestre el metodo de insercion y busqueda de la placa_

_para este metodo se creo un puntero de tipo NodoVehiculo asignandole el nombre de nuevoNodo , luego se valida si la cabez es igual a null si esto es True , ala cabeza se le asigna nuevoNodo , si no es que cabeza igual a null Nodovehiculo filaActual = cabeza , con un while se verifica que fila actual.abajo que es un puntero que va a recorrer hacia abajo es distinto a null si esto se cumple , filaActual se le asigna filaActual.abajo. Este seria un breve repaso hacia este metodo._

```java

  public void Insertar(Vehiculo carro) {
        NodoVehiculo nuevoNodo = new NodoVehiculo(carro);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoVehiculo filaActual = cabeza;

            while (filaActual.abajo != null) {
                filaActual = filaActual.abajo;
            }

```

_Este seria el metodo para buscar por placa._

```java
public NodoVehiculo buscarPorPlaca(String placa) {
        NodoVehiculo filaActual = cabeza;
        while (filaActual != null) {
            NodoVehiculo nodoActual = filaActual;

            while (nodoActual != null) {
                if (nodoActual.vehiculo != null && nodoActual.vehiculo.getPlaca().equals(placa)) {
                    return nodoActual;
                }
                nodoActual = nodoActual.derecha;
            }

            filaActual = filaActual.abajo;
        }

        return null;
    }
```

_La ultima clase de este capa seria la clase vehiculo que cuenta con sus atributos asi como con su constructos , getters y setters._

##

### Servicio

_En la clase llamada helpers se trabajo con un metodo para verificar si es numero_

```java
 public static class validaciones {

        public static boolean esNumero(String valor) {
            if (valor == null || valor.isEmpty()) {
                return false;
            }
            try {
                Double.parseDouble(valor);
                return true;

         } catch (Exception e) {
                return false;
            }
        }
    }


```

_En la clase llamada Ivehiculo , se implemento una interface._

```java
public interface  IVehiculoCallback {
    void onVehiculoObtenido(Vehiculo vehiculo);
}


```

_clase Parqueo Servicio aca se agrego la clase servicio parqueo luego se instancio la clase parqueo Modelo._

```java
public class ParqueosServicio {
   public static class Servicioparqueo{
       public static ParqueoModelo parqueoModelo = new ParqueoModelo();
   }
}


```

#

### Vista

- Inicio: contamos con un pantalla de inico y su menu respectivo.

![inicio](image-1.png)

- Vista parqueo: aca ingresamos la cantidad de parqueos y no lo muestra.

![muestra](image-5.png)

_si damos click a cualquiera de estas dos opciones nos dirige ala siguiente ventana_

![busqueda-eliminacion](image-9.png)

![ventananueva](image-8.png)

- Registrar vehiculo: luego de elegir la cantidad de parqueos y que los muestre podemos dar click en registrar vehiculos y nos muestra la siguiente ventana.

![registro](image-6.png)

\*Esta seria toda la implementacion sobre la Matriz Ortogonal.
