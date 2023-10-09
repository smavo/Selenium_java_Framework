
# SELENIUM 
Es un conjunto de herramientas y bibliotecas de código abierto ampliamente utilizado para la automatización de pruebas de aplicaciones web. Selenium permite a los desarrolladores y probadores automatizar interacciones de usuario en un navegador web, lo que es esencial para probar la funcionalidad de una aplicación web y asegurar su calidad.

### Componentes de Selenium
**Selenium WebDriver** (Controlador de Navegador): Este es el componente principal de Selenium y proporciona una API de alto nivel para interactuar con navegadores web. Selenium WebDriver permite a los usuarios escribir scripts de prueba en lenguajes de programación como Java, Python, C#, etc., y controlar los navegadores como Google Chrome, Firefox, Microsoft Edge, Safari, entre otros. Los scripts de prueba interactúan con los navegadores a través de las API proporcionadas por WebDriver.

**Selenium IDE** (Entorno de Desarrollo Integrado): Selenium IDE es una extensión de navegador que permite grabar y reproducir acciones del usuario en un navegador web. Aunque es útil para crear scripts de prueba rápidamente, es más adecuado para pruebas sencillas y pruebas exploratorias.

**Selenium Grid** (Rejilla de Selenium): Selenium Grid es un componente que permite la ejecución paralela de pruebas en múltiples navegadores y sistemas operativos. Permite distribuir las pruebas en una granja de máquinas para acelerar la ejecución y garantizar la compatibilidad en diferentes configuraciones de navegador y plataforma.

-----------------------------------------------------

### Selenium Architecture Diagram
![Selenium Architecture Diagram](https://d1jnx9ba8s6j9r.cloudfront.net/blog/wp-content/uploads/2019/05/Picture5.png)

-----------------------------------------------------

### Web Locators
Son mecanismos que se utilizan para identificar y localizar elementos en una página web. Estos localizadores permiten a Selenium interactuar con elementos HTML, como botones, enlaces, campos de texto, casillas de verificación, entre otros, durante la ejecución de pruebas de automatización. Selenium proporciona varios tipos de localizadores que puedes utilizar para encontrar elementos en una página web. Los localizadores más comunes en Selenium son los siguientes:

* **ID** (ID del elemento): El localizador By.id("id_del_elemento") busca elementos por su atributo id.

* **Name** (Nombre del elemento): El localizador By.name("nombre_del_elemento") busca elementos por su atributo name.

* **XPath** (Ruta XPath): El localizador By.xpath("ruta_xpath") permite utilizar expresiones XPath para localizar elementos. Puede ser muy poderoso pero también complejo.

* **CSS Selector** (Selector de CSS): El localizador By.cssSelector("selector_css") permite utilizar selectores CSS para localizar elementos. Es otra opción potente.

* *Class Name** (Nombre de la clase): El localizador By.className("nombre_de_clase") busca elementos por su atributo class.

* **Link Text** (Texto del enlace): El localizador By.linkText("texto_del_enlace") busca elementos enlaces (etiquetas <a>) por su texto visible.

* **Partial Link Text** (Texto del enlace parcial): El localizador By.partialLinkText("texto_parcial_del_enlace") busca elementos enlaces por una parte de su texto visible.

* **Tag Name** (Nombre de la etiqueta): El localizador By.tagName("nombre_de_etiqueta") busca elementos por su nombre de etiqueta HTML.


----------------------------------------

### Métodos Selenium WebDriver

#### click(): Este método se utiliza para simular un clic en un elemento de la página, como un botón, un enlace o cualquier otro elemento interactivo.
```
WebElement boton = driver.findElement(By.id("boton_id"));
boton.click();
```

#### sendKeys(): Este método se utiliza para ingresar texto o enviar secuencias de teclas a un campo de entrada, como un campo de texto o una casilla de contraseña.
```
WebElement campoTexto = driver.findElement(By.id("campoTexto_id"));
campoTexto.sendKeys("Texto de ejemplo");
```

#### clear(): Este método se utiliza para borrar el contenido de un campo de entrada.
```
WebElement campoTexto = driver.findElement(By.id("campoTexto_id"));
campoTexto.clear();
```

#### submit(): Este método se utiliza para enviar un formulario web. Puede usarse en un elemento de formulario (como un botón Enviar) o en el formulario mismo.
```
WebElement formulario = driver.findElement(By.id("formulario_id"));
formulario.submit();
```

#### getText(): Este método se utiliza para obtener el texto visible en un elemento de la página, como un párrafo, un encabezado o un enlace.
```
WebElement parrafo = driver.findElement(By.id("parrafo_id"));
String texto = parrafo.getText();
```

#### getAttribute(): Este método se utiliza para obtener el valor de un atributo específico de un elemento.
```
WebElement enlace = driver.findElement(By.tagName("a"));
String href = enlace.getAttribute("href");
```

#### selectByVisibleText(), selectByValue(), selectByIndex(): Estos métodos se utilizan para interactuar con elementos de lista desplegable (selects) en formularios web. Pueden seleccionar opciones por texto visible, valor o índice, respectivamente.
```
Select dropdown = new Select(driver.findElement(By.id("dropdown_id")));
dropdown.selectByVisibleText("Opción 2");
```

#### switchTo(): Este método se utiliza para cambiar el contexto del controlador WebDriver, como cambiar el enfoque a una ventana emergente o a un marco (iframe).
```
driver.switchTo().window("ventana_emergente");
```
Utiliza .switchTo().alert() para cambiar al contexto del cuadro de diálogo de alerta.

Luego, puedes utilizar varios métodos para interactuar con la alerta según el tipo de cuadro de diálogo que sea:
* .getText(): Para obtener el texto del mensaje de alerta.
* .accept(): Para hacer clic en el botón "Aceptar" en un cuadro de alerta o confirmación.
* .dismiss(): Para hacer clic en el botón "Cancelar" en un cuadro de confirmación.
* .sendKeys(String texto): Para ingresar texto en un cuadro de diálogo de entrada.
```
// Cambiar al contexto del cuadro de diálogo de alerta
Alert alerta = driver.switchTo().alert();

// Obtener el texto del mensaje de alerta
String mensajeAlerta = alerta.getText();
System.out.println("Mensaje de alerta: " + mensajeAlerta);

// Aceptar la alerta (hacer clic en el botón "Aceptar")
alerta.accept();
```

#### navigate(): Este método se utiliza para navegar por páginas web. Puede realizar acciones como avanzar, retroceder o recargar la página.
```
driver.navigate().to("https://www.ejemplo.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
```

------------------------------------------

### Aserciones

### Las aserciones son una parte fundamental de las pruebas de automatización con Selenium para verificar que la aplicación web se comporte como se espera. Aquí tienes algunas de las aserciones más comunes que se utilizan en Selenium:

#### assertEquals(expected, actual): Comprueba si el valor actual es igual al valor expected. Se usa para verificar que los elementos de la página tengan el valor esperado.
```
Assert.assertEquals("Texto esperado", elemento.getText());
```

#### assertNotEquals(unexpected, actual): Comprueba si el valor actual no es igual al valor unexpected.
```
Assert.assertNotEquals("Texto inesperado", elemento.getText());
```

#### assertTrue(condition): Verifica si una condición es verdadera. Se utiliza para verificar que un elemento o estado cumpla una condición específica.
```
Assert.assertTrue(elemento.isDisplayed());
```

##### assertFalse(condition): Verifica si una condición es falsa. Se utiliza para verificar que un elemento o estado no cumpla una condición específica.
```
Assert.assertFalse(elemento.isEnabled());
```

#### assertNull(object): Comprueba si un objeto es nulo.
```
Assert.assertNull(variable);
```

#### assertNotNull(object): Comprueba si un objeto no es nulo.
```
Assert.assertNotNull(variable);
```

##### assertArrayEquals(expectedArray, actualArray): Comprueba si dos matrices son iguales.
```
String[] expectedArray = {"uno", "dos", "tres"};
String[] actualArray = obtenerValoresDeElementos();
Assert.assertArrayEquals(expectedArray, actualArray);
```

#### assertXPathCount(expression, expectedCount): Verifica si el recuento de elementos coincidentes con una expresión XPath es igual al valor esperado.
```
int count = driver.findElements(By.xpath("//elemento")).size();
Assert.assertEquals(5, count);
```

#### assertTitle(expectedTitle): Verifica si el título de la página es igual al título esperado.
```
String tituloEsperado = "Título de la Página";
Assert.assertEquals(tituloEsperado, driver.getTitle());
```

#### assertTextPresent(expectedText): Verifica si un texto esperado está presente en la página.
```
Assert.assertTrue(driver.getPageSource().contains("Texto esperado"));
```

