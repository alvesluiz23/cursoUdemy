package Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RedeSocial {
    public static void main(String[] args){

        List<Post> posts = new ArrayList<>();

        posts.add(new Post("Luiz", new Date(),"Teste da minha classe", "Conteudo bem legal"));

        posts.get(0).addComment("Grande dia");
        posts.get(0).addComment("Caneta azul");
        posts.get(0).addComment("Azul caneta");

        posts.add(new Post("Luiz", new Date(),"TLalalala", "Conteudo hoensto"));
        posts.get(1).addComment("Para nossa alegria");
        posts.get(1).addComment("Qualquer coisa");
        posts.get(1).addComment("Chegou o vanderlei");

        Iterator<Post> iteratorForPosts = posts.iterator();

        while (iteratorForPosts.hasNext()){
            printPost(iteratorForPosts.next());
            System.out.print("\n");
        }
    }


    public static void printPost(Post newPost){
        System.out.printf("%s\n", newPost.getTitle());
        for(int i=0; i<10; i++) newPost.addLikes();
        System.out.printf("%d Likes - %s \n", newPost.getLikesCount(), newPost.getFormatedCreateDate());
        System.out.println(newPost.getContent());
        Iterator<Comment> iteratorForCommentsList = newPost.getComments().iterator();

        while(iteratorForCommentsList.hasNext()){
            System.out.println(iteratorForCommentsList.next());
        }

    }
}
