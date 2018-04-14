
System.out.println("O atleta começa a correr.");

// O atleta começa com 100% de todos os três atributos: Força, energia e fôlego.
float forca = 100; 
float energia = 100; 
float folego = 100;

System.out.println("---O atleta começou o percurso---");
// Cada iteração no "for" abaixo é 1 km percorrido.
for(int i=1; i<=100000; i++){
    // Se a força ou a energia ou o fôlego do atleta for menor que 6%, o atleta necessita recarregar as energias... 
    if(forca < 6 || energia < 6 || folego < 6){
	System.out.println("O atleta percorreu" + i + "metros.");
	System.out.println("O atleta necessita recarregar as energias...");
	// Então ele recarrega...
        // A força.
	while(forca < 100){
           forca = forca + 12;
        }
       
	// A energia
        while(energia < 100){
	   energia = energia + 15;
	}
        
	// O fôlego
	while(folego < 100){
	   folego = folego + 22;
	}
	i = i -1; // Compensando o índice.O atleta não percorreu o kilômetro dessa iteração pq ficou parado.
    }else{
	// Se o atleta está com a força, a energia e o fôlego acima de 6%...
	// Ele perde 12% de força, 15% de energia e 22% de fôlego.
	forca = forca - 0.022;
	energia = energia - 0.015;
	folego = folego - 0.012;
    }
}
System.out.println("---O atleta completou o percurso---");
