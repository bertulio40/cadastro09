import java.io.FileOutputStream;

public class Cadastro  {
    private String Nome;
    private String cpf;
    private String endereço;

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

    public String getcpf() {
        return cpf;
    }
    public void setcpf(String cpf) {
        if(cpf.length()< 11) {
            System.out.println("Seu CPF precisa ter 11 numeros ");
            this.cpf = cpf;
        }

    }
    public String getEndereco() {
        return endereço;
    }
    public void setEndereco(String endereco) {
        this.endereço = endereço;
    }




      @Override
      public String toString() {
          final StringBuilder sb = new StringBuilder("Cadastro{");
          sb.append("Nome='").append(Nome).append('\'');
          sb.append(", cpf='").append(cpf).append('\'');
          sb.append(", endereço='").append(endereço).append('\'');

          return sb.toString();

    }
  }




