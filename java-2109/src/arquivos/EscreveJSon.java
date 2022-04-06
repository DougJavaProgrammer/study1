package arquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSon {
	public static void main(String[] args) throws IOException {
		// entramos no google e procuramos por "google Json maven"

		Usuario usuario1 = new Usuario();
		usuario1.setNome("Douglas");
		usuario1.setCpf("59899898509");
		usuario1.setLogin("admin");
		usuario1.setSenha("admin");

		Usuario usuario2 = new Usuario();
		usuario2.setNome("Joao da Silva");
		usuario2.setCpf("444.456.778-20");
		usuario2.setLogin("joazinho");
		usuario2.setSenha("senhajoazinho");

		Usuario usuario3 = new Usuario();
		usuario3.setNome("Aline");
		usuario3.setCpf("362.526.648-20");
		usuario3.setLogin("alinetayla");
		usuario3.setSenha("508502");

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);

		Gson gson = new GsonBuilder().setPrettyPrinting().create(); // para organizar o Json
		String jsonUser = gson.toJson(usuarios);

		System.out.println(jsonUser);

		FileWriter fileWriter = new FileWriter(
				"C:\\Users\\Douglas\\git\\study1\\java-2109\\src\\arquivos\\fileJson.json");
		fileWriter.write(jsonUser);
		fileWriter.flush(); // for�ar a escrita
		fileWriter.close();

		// -----------------------------------------------------LENDO O ARQUIVO
		// JSON----------------------------------------------------------------

		FileReader fileReader = new FileReader(
				"C:\\Users\\Douglas\\git\\study1\\java-2109\\src\\arquivos\\fileJson.json");
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		for (JsonElement jsonElement : jsonArray) { //cada Json Array � um JsonElement
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listaUsuarios.add(usuario);
		}
		System.out.println("Leitura do arquivo JSON: " + listaUsuarios);

	}

}
