  public class Cadastro {
    private String Nome;
    private String telefone;
    private String endereço;
    private String email;
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        if(nome.isBlank()) {
            System.out.println("Nome não pode ser invalido");
        }
        nome = nome.trim();
        Nome = nome.toUpperCase();
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        if(telefone.length()< 11) {
            System.out.println("Seu telefone precisa ter ddd + telefone");
        }else {
            StringBuilder ddd = new StringBuilder(telefone);
            ddd.insert(0, "(");
            ddd.insert(3, ")");
            this.telefone = ddd.toString();
        }

    }
    public String getEndereco() {
        return endereço;
    }
    public void setEndereco(String endereco) {
        this.endereço = endereço;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}




