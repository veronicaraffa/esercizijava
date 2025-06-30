package lezione7_ese2;

import java.util.Stack;

public class Browser1 {
    private Stack<String> cronologia;

    public Browser1() {
        cronologia = new Stack<>();
    }

   
    public void visitPage(String url) {
        cronologia.push(url);
        System.out.println("Visita: " + url);
    }

  
    public void goBack() 
    {
        try 
        {
            if (cronologia.isEmpty()) 
            {
                System.out.println("Errore: nessuna pagina precedente da mostrare.");
            } 
            else if (cronologia.size() == 1) 
            {
                System.out.println("Sei già nella prima pagina: " + cronologia.peek());
            } 
            else 
            {
                String paginaAttuale = cronologia.pop();
                System.out.println("Tornato indietro da: " + paginaAttuale);
                System.out.println("Pagina corrente: " + cronologia.peek());
            }
        } catch (Exception e) {
            System.out.println("Si è verificato un errore durante il ritorno alla pagina precedente.");
        }
    }

    public void printHistory() 
    {
        if (cronologia.isEmpty()) 
        {
            System.out.println("Cronologia vuota.");
        } 
        else 
        {
            System.out.println("Cronologia (dal più recente al meno recente):");
            for (int i = cronologia.size() - 1; i >= 0; i--) 
            {
                System.out.println("- " + cronologia.get(i));
            }
        }
    }
}

