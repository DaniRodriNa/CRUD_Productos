# CRUD_Productos
## Resumen
El proyecto es un microservicio que conecta con una base de datos y mapea una clase Productos. Inserta, visualiza y actualiza productos.
## Estructura
### Paquetes 
* com.curso.inicio
  - Clase **Application.java**
* com.curso.model
  - Clase **Producto.java**
    - codigoProducto: numero entero
    - producto: nombre del producto
    - stock: numero entero
    - precioUnitario: numero con decimales, precio de cada unidad
* com.curso.service
  - Interfaz **ProductosService.java**
  - Clase **ProductosServiceImpl.java** (Implementa la interfaz **ProductosService.java**)
* com.curso.dao
  - Clase **ProductosDao.java**
* com.curso.controller
  - Clase **ProductosController.java**
  
   >GET: Recoge los productos o un producto determinado
   
   >POST: Crea un producto
   
   >PUT: Actualiza un producto
   
## Autor
* Daniel Rodriguez
## Estado
🟢Terminado🟢
