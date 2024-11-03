// src/main/java/Config/DataLoader.java
package Config;

import com.example.servicioDeathNote.models.Serie;
import com.example.servicioDeathNote.models.Temporada;
import com.example.servicioDeathNote.models.Capitulo;
import com.example.servicioDeathNote.models.Personaje;
import com.example.servicioDeathNote.repositories.SerieRepository;
import com.example.servicioDeathNote.repositories.TemporadaRepository;
import com.example.servicioDeathNote.repositories.CapituloRepository;
import com.example.servicioDeathNote.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    private SerieRepository serieRepository;
    @Autowired
    private TemporadaRepository temporadaRepository;
    @Autowired
    private CapituloRepository capituloRepository;
    @Autowired
    private PersonajeRepository personajeRepository;

    @EventListener
    public void loadData(ApplicationReadyEvent event) {
        if (serieRepository.count() == 0) {
            // Crear serie "Death Note"
            Serie deathNote = new Serie(
                    "Death Note",
                    "Anime de suspenso y detectives",
                    "Tsugumi Ohba",
                    "9.0",
                    "ruta/imagen/poster.jpg",
                    1,           // Número de temporadas (1 en este caso)
                    2006         // Año de emisión
            );
            serieRepository.save(deathNote);

            // Crear temporada 1
            Temporada temporada1 = new Temporada(1, 2006, deathNote);
            temporadaRepository.save(temporada1);

            // Crear capítulos de la temporada 1 con las imágenes y calificación asignada
            Capitulo capitulo1 = new Capitulo("Renacimiento", "001", "Primer encuentro entre Light y Ryuk", "ruta/imagen/capitulo1.jpg", 4.5, temporada1);
            Capitulo capitulo2 = new Capitulo("Conflicto", "002", "Light comienza a usar la Death Note", "ruta/imagen/capitulo2.jpg", 4.7, temporada1);
            Capitulo capitulo3 = new Capitulo("Negociaciones", "003", "L y Light comienzan su duelo mental", "ruta/imagen/capitulo3.jpg", 4.6, temporada1);
            Capitulo capitulo4 = new Capitulo("Persecución", "004", "Light se enfrenta a obstáculos inesperados", "ruta/imagen/capitulo4.jpg", 4.8, temporada1);
            Capitulo capitulo5 = new Capitulo("Decepción", "005", "L revela una nueva estrategia", "ruta/imagen/capitulo5.jpg", 4.5, temporada1);
            Capitulo capitulo6 = new Capitulo("Estratagema", "006", "Light sigue esquivando las investigaciones de L", "ruta/imagen/capitulo6.jpg", 4.7, temporada1);
            Capitulo capitulo7 = new Capitulo("Infierno", "007", "Light empieza a notar el costo de sus acciones", "ruta/imagen/capitulo7.jpg", 4.4, temporada1);
            Capitulo capitulo8 = new Capitulo("Mirada", "008", "El equipo de L intensifica la investigación", "ruta/imagen/capitulo8.jpg", 4.6, temporada1);
            Capitulo capitulo9 = new Capitulo("Contacto", "009", "Light se encuentra en una encrucijada", "ruta/imagen/capitulo9.jpg", 4.8, temporada1);
            Capitulo capitulo10 = new Capitulo("Duda", "010", "L intensifica su vigilancia sobre Light", "ruta/imagen/capitulo10.jpg", 4.5, temporada1);
            Capitulo capitulo11 = new Capitulo("Asalto", "011", "Un personaje inesperado complica la trama", "ruta/imagen/capitulo11.jpg", 4.7, temporada1);
            Capitulo capitulo12 = new Capitulo("Amor", "012", "Un nuevo personaje se involucra con Light", "ruta/imagen/capitulo12.jpg", 4.6, temporada1);
            Capitulo capitulo13 = new Capitulo("Confesión", "013", "Se revelan secretos importantes", "ruta/imagen/capitulo13.jpg", 4.9, temporada1);
            Capitulo capitulo14 = new Capitulo("Amistad", "014", "Relación entre Light y su padre se fortalece", "ruta/imagen/capitulo14.jpg", 4.5, temporada1);
            Capitulo capitulo15 = new Capitulo("Juego", "015", "L pone a prueba a Light", "ruta/imagen/capitulo15.jpg", 4.6, temporada1);
            Capitulo capitulo16 = new Capitulo("Decisión", "016", "Light enfrenta una decisión crucial", "ruta/imagen/capitulo16.jpg", 4.7, temporada1);
            Capitulo capitulo17 = new Capitulo("Ejecución", "017", "L mueve sus piezas de manera estratégica", "ruta/imagen/capitulo17.jpg", 4.5, temporada1);
            Capitulo capitulo18 = new Capitulo("Alianza", "018", "Light forma una alianza inesperada", "ruta/imagen/capitulo18.jpg", 4.8, temporada1);
            Capitulo capitulo19 = new Capitulo("Matsuda", "019", "El personaje Matsuda juega un papel clave", "ruta/imagen/capitulo19.jpg", 4.6, temporada1);
            Capitulo capitulo20 = new Capitulo("Impaciencia", "020", "Tensiones aumentan en ambos lados", "ruta/imagen/capitulo20.jpg", 4.5, temporada1);
            Capitulo capitulo21 = new Capitulo("Actividad", "021", "L y su equipo se acercan a Light", "ruta/imagen/capitulo21.jpg", 4.7, temporada1);
            Capitulo capitulo22 = new Capitulo("Guía", "022", "Light manipula situaciones a su favor", "ruta/imagen/capitulo22.jpg", 4.6, temporada1);
            Capitulo capitulo23 = new Capitulo("Frenesí", "023", "Se acelera la tensión y el conflicto", "ruta/imagen/capitulo23.jpg", 4.9, temporada1);
            Capitulo capitulo24 = new Capitulo("Resurrección", "024", "Un personaje clave vuelve a la acción", "ruta/imagen/capitulo24.jpg", 4.8, temporada1);
            Capitulo capitulo25 = new Capitulo("Silencio", "025", "L y Light tienen una confrontación", "ruta/imagen/capitulo25.jpg", 4.5, temporada1);
            Capitulo capitulo26 = new Capitulo("Renacer", "026", "Nuevo inicio en la historia", "ruta/imagen/capitulo26.jpg", 4.6, temporada1);
            Capitulo capitulo27 = new Capitulo("Abismo", "027", "Light enfrenta nuevos desafíos", "ruta/imagen/capitulo27.jpg", 4.7, temporada1);
            Capitulo capitulo28 = new Capitulo("Impulso", "028", "Light busca consolidar su poder", "ruta/imagen/capitulo28.jpg", 4.4, temporada1);
            Capitulo capitulo29 = new Capitulo("Padre", "029", "Conflictos entre Light y su padre", "ruta/imagen/capitulo29.jpg", 4.8, temporada1);
            Capitulo capitulo30 = new Capitulo("Justicia", "030", "La moralidad de Light es cuestionada", "ruta/imagen/capitulo30.jpg", 4.6, temporada1);
            Capitulo capitulo31 = new Capitulo("Transferencia", "031", "Cambio de dinámica en la historia", "ruta/imagen/capitulo31.jpg", 4.7, temporada1);
            Capitulo capitulo32 = new Capitulo("Elección", "032", "Light enfrenta otra elección difícil", "ruta/imagen/capitulo32.jpg", 4.9, temporada1);
            Capitulo capitulo33 = new Capitulo("Mirada", "033", "La presión crece", "ruta/imagen/capitulo33.jpg", 4.8, temporada1);
            Capitulo capitulo34 = new Capitulo("Vigilancia", "034", "Se intensifica la vigilancia sobre Light", "ruta/imagen/capitulo34.jpg", 4.5, temporada1);
            Capitulo capitulo35 = new Capitulo("Asesinato", "035", "Las acciones de Light son expuestas", "ruta/imagen/capitulo35.jpg", 4.7, temporada1);
            Capitulo capitulo36 = new Capitulo("1.28", "036", "Light se enfrenta a Near", "ruta/imagen/capitulo36.jpg", 4.9, temporada1);
            Capitulo capitulo37 = new Capitulo("Nuevo Mundo", "037", "El desenlace final entre Light y Near", "ruta/imagen/capitulo37.jpg", 5.0, temporada1);

            // Guardar todos los capítulos
            capituloRepository.save(capitulo1);
            capituloRepository.save(capitulo2);
            capituloRepository.save(capitulo3);
            capituloRepository.save(capitulo4);
            capituloRepository.save(capitulo5);
            capituloRepository.save(capitulo6);
            capituloRepository.save(capitulo7);
            capituloRepository.save(capitulo8);
            capituloRepository.save(capitulo9);
            capituloRepository.save(capitulo10);
            capituloRepository.save(capitulo11);
            capituloRepository.save(capitulo12);
            capituloRepository.save(capitulo13);
            capituloRepository.save(capitulo14);
            capituloRepository.save(capitulo15);
            capituloRepository.save(capitulo16);
            capituloRepository.save(capitulo17);
            capituloRepository.save(capitulo18);
            capituloRepository.save(capitulo19);
            capituloRepository.save(capitulo20);
            capituloRepository.save(capitulo21);
            capituloRepository.save(capitulo22);
            capituloRepository.save(capitulo23);
            capituloRepository.save(capitulo24);
            capituloRepository.save(capitulo25);
            capituloRepository.save(capitulo26);
            capituloRepository.save(capitulo27);
            capituloRepository.save(capitulo28);
            capituloRepository.save(capitulo29);
            capituloRepository.save(capitulo30);
            capituloRepository.save(capitulo31);
            capituloRepository.save(capitulo32);
            capituloRepository.save(capitulo33);
            capituloRepository.save(capitulo34);
            capituloRepository.save(capitulo35);
            capituloRepository.save(capitulo36);
            capituloRepository.save(capitulo37);

            // Crear personajes principales
            Personaje light = new Personaje("Light Yagami", "ruta/imagen/light.jpg", "Estudiante brillante que encuentra la Death Note", "Protagonista", deathNote);
            Personaje ryuk = new Personaje("Ryuk", "ruta/imagen/ryuk.jpg", "Shinigami que posee la Death Note", "Shinigami", deathNote);
            Personaje misa = new Personaje("Misa Amane", "ruta/imagen/misa.jpg", "Modelo famosa que se convierte en aliada de Light", "Aliada", deathNote);
            Personaje l = new Personaje("L", "ruta/imagen/l.jpg", "Detective enigmático que busca detener a Kira", "Antagonista", deathNote);
            Personaje near = new Personaje("Near", "ruta/imagen/near.jpg", "Joven detective que continúa el caso Kira después de L", "Antagonista", deathNote);
            Personaje mello = new Personaje("Mello", "ruta/imagen/mello.jpg", "Rival de Near en la búsqueda de Kira", "Antagonista", deathNote);

            personajeRepository.save(light);
            personajeRepository.save(ryuk);
            personajeRepository.save(misa);
            personajeRepository.save(l);
            personajeRepository.save(near);
            personajeRepository.save(mello);
        }

    }
}
