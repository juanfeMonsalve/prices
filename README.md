# prices

Se realiza el servicio con java 17 y springboot con coneccion a h2 

Se adjunta curl para postman por si se desea hacer pruebas desde alli, tambien existe un archivo PricesControllerTest que
al ejecutar corre las pruebas solicitadas

La base de datos se crea y se pobla al ejecutar la aplicacion

curl --location 'http://localhost:8080/api/prices?brandId=1&productId=35455&applicationDate=2020-06-14T10%3A00%3A00'