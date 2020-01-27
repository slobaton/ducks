**Técnicas estándar de POO**
 - Se tiene implementado la herencia básica, todas la clases que extiendan de la clase Duck están obligadas a implementar la clase display.

**Nuevo requerimiento**
 - Al pedir que los patos puedan volar se intento poner el comportamiento en el método fly en la clase abstracta Duck lo que llevó a comportamientos inesperados de sub tipos de patos que no tienen el mencionado comportamiento
 - La herencia en este punto no es un solución óptima, no permite la escabilidad en el sistema.
 
**Agregando Interfaces**
 - Se aplica la segregación por comportamiento, separando en interfaces los comportamientos que algunos patos pueden tener.
 - Mantenimiento difícil por cada nuevo pato se que implemente un comportamiento y si por algún motivo este comportamiento de alguna manera cambia, ese cambio se hará en todas las subclases.
 - El sistema no tiene la facilidad de adaptació al cambio.


  