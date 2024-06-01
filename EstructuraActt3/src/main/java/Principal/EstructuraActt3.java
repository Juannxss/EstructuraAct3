package Principal;

import Clases.Estudiante;
import Clases.AdultoMayor;
import Clases.Bala;

public class EstructuraActt3 {

    public static void main(String[] args) {

       
        
        //Se crean los objeto de tipo estudiante con atributos nombre, apellidom curso, edad y altura
        Estudiante estu1 = new Estudiante("Juan", "Lopez", "9°1", 18, 1.68f);
        Estudiante estu2 = new Estudiante("Gabriela", "Gomez", "9°1", 15, 1.50f);
        Estudiante estu3 = new Estudiante("David", "Palomino", "9°1", 17, 1.72f);
        Estudiante estu4 = new Estudiante("Sara", "Muñoz", "9°1", 14, 1.67f);
        Estudiante estu5 = new Estudiante("Manuel", "Diaz", "9°1", 18, 1.80f);
        Estudiante estu6 = new Estudiante("Samuel", "Beleño", "9°1", 16, 1.77f);
        Estudiante estu7 = new Estudiante("Manuela", "Castañeda", "9°1", 17, 1.67f);
        Estudiante estu8 = new Estudiante("Gladis", "Huratdo", "9°1", 18, 1.65f);
        Estudiante estu9 = new Estudiante("Ayleen", "Salgado", "9°1", 18, 1.81f);
        Estudiante estu10 = new Estudiante("Martin", "Perez", "9°1", 14, 1.60f);
        Estudiante estu11 = new Estudiante("David", "Arias", "9°1", 25, 1.50f);

        Estudiante estu12 = new Estudiante("Saray", "Suñiga", "9°2", 15, 1.67f);
        Estudiante estu13 = new Estudiante("Daniel", "Zapata", "9°2", 18, 1.70f);
        Estudiante estu14 = new Estudiante("Neymar", "Pele", "9°2", 16, 1.63f);
        Estudiante estu15 = new Estudiante("Ronaldo", "Rodriguez", "9°2", 15, 1.90f);
        Estudiante estu16 = new Estudiante("Angel", "Hernandez", "9°2", 16, 1.61f);
        Estudiante estu17 = new Estudiante("Juan", "Torres", "9°2", 18, 1.58f);
        Estudiante estu18 = new Estudiante("Carlos", "Rojas", "9°2", 15, 1.66f);
        Estudiante estu19 = new Estudiante("Jackson", "Moreno", "9°2", 17, 1.73f);
        Estudiante estu20 = new Estudiante("Lucas", "Ortiz", "9°2", 14, 1.69f);
        Estudiante estu21 = new Estudiante("Liam", "Castro", "9°2", 18, 1.84f);

        Estudiante estu22 = new Estudiante("Vicente", "Gomez", "9°3", 16, 1.77f);
        Estudiante estu23 = new Estudiante("Edgar", "Ruiz", "9°3", 15, 1.75f);
        Estudiante estu24 = new Estudiante("Alejandro", "Lamadrid", "9°3", 16, 1.82f);
        Estudiante estu25 = new Estudiante("Diego", "Suarez", "9°3", 18, 1.67f);
        Estudiante estu26 = new Estudiante("Santiago", "Rivera", "9°3", 15, 1.52f);
        Estudiante estu27 = new Estudiante("Sebastian", "Arias", "9°3", 17, 1.71f);
        Estudiante estu28 = new Estudiante("Oliver", "Mejia", "9°3", 14, 1.57f);
        Estudiante estu29 = new Estudiante("James", "Rodriguez", "9°3", 18, 1.80f);
        Estudiante estu30 = new Estudiante("Enzo", "Fernandez", "9°3", 16, 1.87f);
        Estudiante estu31 = new Estudiante("Alexander", "00", "9°3", 15, 1.55f);
        Estudiante estu32 = new Estudiante("Paul", "Wlaker", "9°3", 16, 2.0f);

        System.out.println("---COLA DE PREIORIDAD ASCENDENTE---");
        //Se inicializa la cola personalizada con prioridad ascendente 
        ColaFifo1 colaFifo1 = new ColaFifo1();
        
        //se añaden los objetos estudiantes 
        colaFifo1.añadir(estu1);
        colaFifo1.añadir(estu2);
        colaFifo1.añadir(estu3);
        colaFifo1.añadir(estu4);
        colaFifo1.añadir(estu5);
        colaFifo1.añadir(estu6);
        colaFifo1.añadir(estu7);
        colaFifo1.añadir(estu8);
        colaFifo1.añadir(estu9);
        colaFifo1.añadir(estu10);
        colaFifo1.añadir(estu11);
        colaFifo1.añadir(estu12);
        colaFifo1.añadir(estu13);
        colaFifo1.añadir(estu14);
        colaFifo1.añadir(estu15);
        colaFifo1.añadir(estu16);
        colaFifo1.añadir(estu17);
        colaFifo1.añadir(estu18);
        colaFifo1.añadir(estu19);
        colaFifo1.añadir(estu20);
        colaFifo1.añadir(estu21);
        colaFifo1.añadir(estu22);
        colaFifo1.añadir(estu23);
        colaFifo1.añadir(estu24);
        colaFifo1.añadir(estu25);
        colaFifo1.añadir(estu26);
        colaFifo1.añadir(estu27);
        colaFifo1.añadir(estu28);
        colaFifo1.añadir(estu29);
        colaFifo1.añadir(estu30);
        colaFifo1.añadir(estu31);
        colaFifo1.añadir(estu32);

        colaFifo1.imprimir();//Se llama al metodo imprimir para mostrar los atributos de los objetos almacenados
        System.out.println();
        colaFifo1.eliminar();//este metodo elimina el primer elenmento de la cola
        System.out.println("El tamaño de la cola es: "+colaFifo1.tamaño());//se muestra la cantidad de elementos
        
        System.out.println();
        System.out.println("---COLA CON PRIORIDAD DESCENDETE---");
        
        //Se crean los objetos de tipo adulto mayor con atributos nombre, apellido, genero y edad
        AdultoMayor adu1 = new AdultoMayor("Juan", "Lopez", "hombre", 66);
        AdultoMayor adu2 = new AdultoMayor("Alberto", "Perez", "hombre", 70);
        AdultoMayor adu3 = new AdultoMayor("John", "Arrieta", "hombre", 81);
        AdultoMayor adu4 = new AdultoMayor("Matias", "Navarrete", "hombre", 99);
        AdultoMayor adu5 = new AdultoMayor("Raul", "Gonzales", "hombre", 87);
        AdultoMayor adu6 = new AdultoMayor("Maria", "almanza", "mujer", 77);
        AdultoMayor adu7 = new AdultoMayor("Natalia", "Ortiz", "mujer", 85);
        AdultoMayor adu8 = new AdultoMayor("Secilia", "Sanchez", "mujer", 69);
        AdultoMayor adu9 = new AdultoMayor("Paula", "Diaz", "mujer", 68);
        AdultoMayor adu10 = new AdultoMayor("Pedro", "Perez", "hombre", 76);
        
        //Se inicializa la cola con prioridad descendente
        ColaLifo1 colaLifo1 = new ColaLifo1();
        
        //Se añaden los objetos a la cola
        colaLifo1.añadir(adu1);
        colaLifo1.añadir(adu2);
        colaLifo1.añadir(adu3);
        colaLifo1.añadir(adu4);
        colaLifo1.añadir(adu5);
        colaLifo1.añadir(adu6);
        colaLifo1.añadir(adu7);
        colaLifo1.añadir(adu8);
        colaLifo1.añadir(adu9);
        colaLifo1.añadir(adu10);

       
        colaLifo1.imprimir(); //Se llama al metodo imprimir para mostrar todos los atributos de los objetos almacenados
        System.out.println();
        colaLifo1.eliminar();//se elimina el elemento de la cola
        System.out.println("El tamaño de la cola es "+colaLifo1.tamaño());
        System.out.println();
        
        
        //Se crean los objetos de tipo bala con atributos numero de bala, calibre, peso, y material
        Bala uno = new Bala("bala 1", "9mm", "115gr", "plomo");
        Bala dos = new Bala("bala 2", "9mm", "115gr", "plomo");
        Bala tres = new Bala("bala 3", "9mm", "115gr", "plomo");
        Bala cuatro = new Bala("bala 4", "9mm", "115gr", "plomo");
        Bala cinco = new Bala("bala 5", "9mm", "115gr", "plomo");
        Bala seis = new Bala("bala 6", "9mm", "115gr", "plomo");
        Bala siete = new Bala("bala 7", "9mm", "115gr", "plomo");
        Bala ocho = new Bala("bala 8", "9mm", "115gr", "plomo");
        Bala nueve = new Bala("bala 9", "9mm", "115gr", "plomo");
        Bala dies = new Bala("bala 10", "9mm", "115gr", "plomo");
        Bala once = new Bala("bala 11", "9mm", "115gr", "plomo");
        Bala doce = new Bala("bala 12", "9mm", "115gr", "plomo");

      

        System.out.println("---PILA PERSONALIZADA---");
        //Se crea una pila personalizada 
        PilaPersonalizada pila = new PilaPersonalizada();
        //Se agregan los objetos de tipo bala a la pila
        pila.apilar(uno);
        pila.apilar(dos);
        pila.apilar(tres);
        pila.apilar(cuatro);
        pila.apilar(cinco);
        pila.apilar(seis);
        pila.apilar(siete);
        pila.apilar(ocho);
        pila.apilar(nueve);
        pila.apilar(dies);
        pila.apilar(once);
        pila.apilar(doce);
 
         
        pila.imprimir();//Se llama al metodo imprimir para que muestre los objetos de la pila
        System.out.println();
        pila.desapilar();//Se llama al metodo desapilar para eliminar el elemento del tope de la pila
        
        

        System.out.println();
        System.out.println("---COLA PERSONALIZADA COMO PILA---");
        //Se inicializa la cola ascendente convertida en pila
        ColaLifoAPila colaApila = new ColaLifoAPila();
        //Se añaden los objetos de tipo adulto mayor 
        colaApila.añadir(adu1);
        colaApila.añadir(adu2);
        colaApila.añadir(adu3);
        colaApila.añadir(adu4);
        colaApila.añadir(adu5);
        colaApila.añadir(adu6);
        colaApila.añadir(adu7);
        colaApila.añadir(adu8);
        colaApila.añadir(adu9);
        colaApila.añadir(adu10);
 
       
        colaApila.imprimir(); //Se llama al metodo imprimir para mostrar los objetos alamcenados 
        colaApila.eliminar();//se elimina el elemento del tope de la pila
    }
}
