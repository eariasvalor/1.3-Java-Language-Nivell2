# Exercici 1 - Classe Restaurant i HashSet

📄 **Descripció - Enunciat de l'exercici**

Crea una classe anomenada Restaurant amb dos atributs:
-nom (String)
-puntuació (int)

Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.

🔹 Important:
Pot haver-hi restaurants amb el mateix nom però amb puntuacions diferents.
No pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.

# Exercici 2 - Classe Restaurant ordenada (Comparable i Comparator)

📄 **Descripció - Enunciat de l'exercici**

Utilitzant la classe Restaurant de l’exercici anterior, crea la implementació necessària perquè els objectes de la classe estiguin ordenats per nom i, en cas d’empat, per puntuació en ordre descendent.

Exemple de sortida:  
-nom: restaurant1, puntuació: 8  
-nom: restaurant1, puntuació: 7

-----------------------------------

💻 Tecnologies Utilitzades

- Java SE 21 (o superior)
- IDE (IntelliJ IDEA)
- Terminal per a compilar i executar amb javac i java

-----------------------------------

📋 Requisits

- JDK 17 o superior instal·lat
- Variable d’entorn JAVA_HOME configurada
- Accés a terminal/command prompt
- Opcional: un IDE per facilitar l’execució

---

🛠️ Instal·lació

1. Clona aquest repositori:
   git clone <URL-del-repositori>
2. Accedeix al directori del projecte:
   cd <nom-de-l'exercici>
3. Comprova que tens Java instal·lat:
   java -version

-----------------------------------

▶️ Execució

1. Compila el projecte:
   javac *.java
2. Executa la classe principal:
   java <nom-de-la-classe>

🌐 Desplegament

Per desplegar el projecte en un entorn de producció o servidor:
1. Empaqueta el projecte en un .jar:
   jar cfe <nom-exercici>.jar <nom-exercici> *.class
2. Puja l’arxiu .jar al servidor.
3. Executa’l amb:
   java -jar <exercici>.jar

🤝 Contribucions

Les contribucions són benvingudes! Si vols participar:
1. Fes un fork del repositori.
2. Crea una nova branca:
   git checkout -b feature/NovaFuncionalitat
3. Fes els teus canvis i commiteja’ls:
   git commit -m 'Afegeix Nova Funcionalitat'
4. Puja els canvis a la teva branca:
   git push origin feature/NovaFuncionalitat
5. Fes un pull request.
