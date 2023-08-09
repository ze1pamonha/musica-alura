package alura.musica;

public class MinhasPreferidas {
     public void incui(Audio audio){
         if (audio.getClassificacao()>=8){
             System.out.println(audio.getTitulo()+" e considerado sucesso absoluto e preferido por todos");
         }else {
             System.out.println(audio.getTitulo()+" tambem e um dos que todo mundo esta curtindo");
         }
     }

}
