package br.com.generation.helloworld;
/*Função: Exercício 1 Spring-boot
 * Autora: Talu - Turma 25
 * Data: 23.06.2021
*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping ("/hello")
public class HelloWorld {

@GetMapping public String Hello(){
return ("<strong>Hello World! </strong> <br>Habilidades: Precisei de <strong>Proatividade</strong> e <strong>Orientação ao Detalhe</strong>. <br>Mentalidades: Precisei de [muuuita] <strong>Persistência</strong> e <strong>Responsabilidade Pessoal</strong> para não desistir ");
}

}
