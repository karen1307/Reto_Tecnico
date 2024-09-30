#Autor: Karen
# language: es
# Creación de Feature en Español para agregar productos al carro de compras en floristeria San Angel
Característica: Carro de compras Floristeria
  Yo como usuario
  Quiero agregar 2 productos al carrito de compras
  Para validar cuanto tengo que pagar

  Antecedentes:
    Dado "Usuario" abre el sitio web de pruebas

  @AgregarDosProductos
  Escenario: Agregar 2 productos al carro de compras
    Cuando seleccione el primer producto con su cantidad
    Y seleccione el segundo producto con su cantidad
    Entonces Visualizará los productos en el carrito de compras con sus cantidades