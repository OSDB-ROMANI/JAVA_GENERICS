# JAVA_GENERICS
<h2>Introduzione Generale</h2>
Serve per definire il tipo degli attributi di una classe durante la creazione dell'oggetto. Per farlo dopo il nome della classe va inserito tra i simboli <> una o più lettere che andranno utilizzate per definirne il tipo.</br>
Utilizzo:</br>
<ul>
  <li>All'attributo viene associato il tipo dinamicamente</br>EsempioGenerics eg = new EsempioGenerics(true,11.25);</br>//Il tipo cambia</br>reg.setAttributi("ciao", "mondo");</li>
  <li>Fissiamo il tipo associato nella dichiarazione</br>EsempioGenerics< Boolean,String > eg1 = new EsempioGenerics<>(true,"ciao");</br>eg1.print();</br>//Il tipo non può cambiare</br>eg1.setAttributi("ciao", "mondo"); // GENERA ERRORE</li>
</ul>
In allegato esempio: EsGenerics</br>
PS: Modificare il codice main per togliere l'errore.
<hr>
<h1>Approfondimento</h1>
In caso il Generics rappresenta una classe che a sua volta estende un'altra classe per poter utilizzare i metodi della classe padre occorre esetendere anche il Generics</br>
Esempio
<ol>
  <li>class Anilame</li>
  <li>class Gatto extends Animale</li>
  <li>class Cane extends Animale</li>
</ol>
Adattiamo i Genericts per poter utilizzare sia oggetti di tipo Gatto che di tipo Cane e i metodi di Animale:</br>
class AninaleGenerics <T extends Animale>{ }</br>
In allegato l'esempio: GenericsExtends.
<h2>Come tipo nei Metodi</h2>
E' possibile utilizzare i generics come tipo in un metodo:</br>
private static <T> stampa(T a){}</br>
Posso utilizzare il metodo per stampare qualsiasi tipo di valore passato
In allegato esempio: GenericsMethot
