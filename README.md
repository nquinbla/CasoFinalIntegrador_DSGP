# Caso Final Integrador: Desarrollo de un Sistema de Gestión de Publicaciones
Caso Final Integrador: Desarrollo de un Sistema de Gestión de Publicaciones de Nerea Quintanilla Blanco, los respectivos ejercicios se sitúan tras su explicación en corchetes.
LINK: https://github.com/nquinbla/CasoFinalIntegrador_Publicaciones.git

## DESCRIPCIÓN
Un programa donde al iniciarse lo primero que ves es la pantalla incial. Aparece el título de la UAX con los subtítulos de la universidad y de la asignatura correspondiente, acompañados de un fondo azul claro combiando con formas geométricas más oscuras, también aparece el logo de la universidad. DEntro podemos ejecutar cinco tipos de porgramas explicados más adelante donde podremos editar un texto y guardarlo, abrir un archivo txt y cambiarelo, comparar dos archivos, buscar palabras en un texto, validar email, etc.

## MÓDULO
 ### 1. Editor de Texto Interactivo (Ejercicio 1 y 2)
  * Creación y Almacenamiento: Desarrollar una interfaz gráfica donde los usuarios puedan escribir y editar textos, con la opción de guardarlos en un archivo -> [EditorTextoGUI]
  * Navegación y Listado: Implementar una funcionalidad que permita a los usuarios ver una lista de sus documentos y seleccionar cualquiera para visualizar o continuar editando -> [Documento]
    
### 2. Comprador y Contador de Contenido (Ejercicio 3 y 4) 
  * Herramienta de Comparación: Crear una función que permita a los usuarios seleccionar y comparar dos archivos para verificar si son iguales o encontrar diferencias -> [ComparadorContenido]
  * Análisis de Texto: Desarrollar una herramienta que cuente el número de palabras en un documento y ofrezca estadísticas de uso para ayudar en la edición y el mejoramiento del texto -> [AnálisisTexto]
  * Ejecución -> [ComparadorContenidoGUI]

### 3. Búsqueda de Palabras y Gestión de Contactos (Ejercicios 5 y 6):
  * Buscador de Palabras: Incorporar una función que permita a los usuarios buscar cuántas veces aparece una palabra específica en un documento -> [BuscadorPalabras] & [BuscadorPalabrasGUI]
  * Agenda de Contactos: Crear una sección en la aplicación donde los usuarios puedan guardar y gestionar contactos (otros escritores, editores, etc.), con detalles como nombre, e-mail y número de teléfono -> [AgendaContactos] & [Contactos]

### 4. Interfaz Gráfica Avanzada (Ejercicios 7, 8 y 9):
  * Multiplicidad de Ventanas: Implementar un sistema de ventanas múltiples que permita a los usuarios trabajar con varios documentos al mismo tiempo -> [VentanaDocumento] & [VentanaPrincipal]
  * Seguimiento del Ratón: Integrar etiquetas que muestren la posición del ratón en tiempo real mientras el usuario trabaja -> [SeguimientoRatón]
  * Barra de Desplazamiento Interactiva: Añadir una barra de desplazamiento que muestre el progreso del documento y permita a los usuarios saltar a diferentes secciones de forma intuitiva -> [BarraDesplazamientoInteractiva]

### 5. Validación de E-mail y Diseño Gráfico (Ejercicios 10 y 11):
  * Validador de E-mail: Desarrollar un sistema que verifique en tiempo real si el texto introducido en un campo es un e-mail válido, mostrando un indicador visual de validación -> [ValidadorEmail]
  * Herramienta de Dibujo: Crear una función simple de dibujo que permita a los usuarios esbozar ideas o diagramas que puedan acompañar sus textos -> [HerramientaDibujo]

### EXTRAS
Además contamos con algunas clases más como el Mainframe [Mainframe.java] en el cuál tenemos todo lo que se debería de ejecutar en el Main, y el DecoraciónPanel, donde hemos decorado la ventana principal con títulos y colores.

## ENTREGABLES
* Aplicación de Gestión de Publicaciones: Un software interactivo que integre todas las funcionalidades mencionadas con una interfaz de usuario gráfica y amigable.
* Documento de Diseño y Especificaciones: Un informe detallado que incluya la descripción de cada módulo, diagramas de las interfaces de usuario, y explicaciones de cómo se manejan los datos y eventos en la aplicación.

## EVALUACIÓN
Este proyecto final integrador desafía a los estudiantes a combinar habilidades técnicas con creatividad para desarrollar una herramienta útil y atractiva que podría tener aplicaciones reales en el mundo de la escritura y el periodismo.

- Funcionalidad y Correctitud: ¿Cumple la aplicación con todas las funcionalidades requeridas y produce los resultados esperados?
- Calidad de la Interfaz de Usuario: ¿Es la interfaz intuitiva, estéticamente agradable y fácil de navegar?
- Eficiencia del Código: ¿Es el código bien estructurado, eficiente y fácil de entender?
- Innovación y Utilidad: ¿Cómo de innovador es el proyecto y cuánto mejora la experiencia de los usuarios?
- Documentación y Presentación: ¿Está bien documentado y presentado el diseño, la implementación y el uso de la aplicación?

Objetivo: Evaluar la capacidad de los estudiantes para aplicar habilidades de programación, diseño de interfaces de usuario, y lógica de software en el desarrollo de un sistema de gestión de publicaciones interactivo y eficiente.


## CRITERIOS DE EVALUACIÓN + RÚBRICA
### Funcionalidad y Correctitud (25%)
- Excelente (100%): Todas las funcionalidades implementadas funcionan correctamente y manejan casos extremos y errores de manera eficaz. Cumple con todos los requisitos y especificaciones.
- Bueno (75%): La mayoría de las funcionalidades funcionan correctamente, con errores menores que no afectan la funcionalidad general.
- Adecuado (50%): Las funcionalidades básicas están presentes y funcionan, pero hay errores notables o problemas en casos extremos.
- Insuficiente (25%): Varios componentes no funcionan correctamente, afectando la usabilidad y la efectividad del sistema.

### Calidad de la Interfaz de Usuario (20%)
- Excelente (100%): La interfaz es intuitiva, estéticamente agradable, y facilita una navegación fluida y una experiencia de usuario positiva.
- Bueno (75%): La interfaz es funcional y generalmente fácil de usar, pero con algunas áreas que podrían mejorarse para una mejor experiencia.
- Adecuado (50%): La interfaz cumple con los requisitos básicos, pero carece de refinamiento y claridad en algunos aspectos.
- Insuficiente (25%): La interfaz es confusa, difícil de navegar, o visualmente poco atractiva.

### Eficiencia del Código (20%)
- Excelente (100%): Código bien estructurado, eficiente, y optimizado, fácil de entender y mantener.
- Bueno (75%): Código generalmente bien organizado y funcional con pequeñas áreas que podrían ser optimizadas.
- Adecuado (50%): Código funcional pero con espacio evidente para mejorar en términos de estructura, eficiencia y claridad.
- Insuficiente (25%): Código desordenado, ineficiente y difícil de entender o mantener.

### Innovación y Utilidad (20%)
- Excelente (100%): El proyecto demuestra un alto nivel de innovación y aporta significativamente a mejorar la gestión y publicación de contenidos.
- Bueno (75%): El proyecto presenta características innovadoras y útiles que aportan valor al sistema.
- Adecuado (50%): El proyecto tiene algunos elementos innovadores, pero en su mayoría sigue enfoques convencionales.
- Insuficiente (25%): Poca innovación o elementos que realmente mejoren la experiencia del usuario o la eficiencia del sistema.

### Documentación y Presentación (15%)
- Excelente (100%): Documentación y presentación excepcionales, incluyendo detalles completos, claros y bien organizados del sistema.
- Bueno (75%): Documentación y presentación bien realizadas con algunas áreas menores que podrían mejorarse.
- Adecuado (50%): Documentación y presentación básicas que cubren los requisitos pero carecen de detalles y claridad.
- Insuficiente (25%): Documentación y presentación pobres, faltan detalles importantes, y es difícil entender el sistema.

Total de Puntos Posibles: 100

Escala de Calificación:
* 90-100: Sobresaliente
* 80-89: Muy Bueno
* 70-79: Bueno
* 60-69: Adecuado
* 0-59: Insuficiente

#### Comentarios Adicionales:
* Se espera que los proyectos sean entregados en la fecha y hora acordadas. Las entregas tardías pueden afectar la calificación.
* Se alienta a los estudiantes a buscar retroalimentación y realizar revisiones durante el desarrollo para asegurar la calidad y funcionalidad del sistema.
* El trabajo debe ser original y propio del equipo. El plagio resultará en una calificación de cero.

Esta rúbrica está diseñada para proporcionar una evaluación detallada y justa del proyecto final integrador, considerando varios aspectos críticos en el desarrollo de software y diseño de interfaces de usuario.


