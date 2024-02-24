
package projetoluta;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    Lutador(String no, String na, int id, double al, double pe, String cat, int vi, int de, int em){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.derrotas = de;
        this.empates = em;
        
    }

    
    
    public void apresentar(){
        System.out.println("================================");
        System.out.println("Com " + this.getVitorias() + " vitorias");
        System.out.println("Recebam o GRANDEEEEE " + this.getNome());
    }
    
    public void status(){
        System.out.println("================================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " +this.getCategoria());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        
        
    }
    
    public void ganharLuta(){    
        this.setVitorias(this.getVitorias() + 1);   
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    private double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;   
        this.setCategoria();
        
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Invalida";
        }else if(this.getPeso() > 65.8){
            this.categoria = "Leve";   
        }else if(this.getPeso() > 70.3){
            this.categoria = "Medio";
        }else if(this.getPeso() > 83.9 && this.getPeso() <= 120.2){
            this.categoria =  "Pesado";
        }
        
    }
    

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
