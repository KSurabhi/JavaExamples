package test;

import java.util.*;

class OpenNotepad
{
  public static void main(String[] args) 
  {
      Runtime app=Runtime.getRuntime();
      try
      {
          
          app.exec("notepad");
          
          app.exec("calc");
          
          
      }
      catch (Exception Ex)
      {
          System.out.println("Error: " + Ex.toString());
      }
  }
}
