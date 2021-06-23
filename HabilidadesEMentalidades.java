package br.com.generation.helloworld;
/*Função: Exercício 1 Spring-boot
 * Autora: Talu - Turma 25
 * Data: 23.06.2021
*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping ("/hem")
public class HabilidadesEMentalidades {

@GetMapping public String Hello(){
return ("<strong>Hello World!</strong> <br>Ao longo dessa semana espero aprimorar minhas habilidades com o Spring-boot.");
}

}