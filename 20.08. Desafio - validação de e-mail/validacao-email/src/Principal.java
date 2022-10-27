public class Principal {

    public static void main(String[] args) {
        String[] emailsValidos = { "joao@algaworks.com", "joao_silva@algaworks.com",
                "joao.silva@algaworks.com", "joao-silva@algaworks.com",
                "joao123@algaworks.com", "joao@algaworks123.com",
                "joao@java.algaworks.com", "joao@alga-works.com", "joao@email.me",
                "Joao@algaworks.com"
        };

        String[] emailsInvalidos = { "", " joao@algaworks.com", "joao@algaworks.com ",
            "joao @algaworks.com", "joao@ algaworks.com", "joao@algaworks .com",
                "joao@algaworks. com", "joaoalgaworks.com", "@algaworks.com",
                "joao@algaworks", "joao@algaworks.abcdef", "joao@alga@works.com",
                "joao@algaworks.co1", "joao@AlgaWorks.com", "joao@algaworks.Com",
                "joao.com@algaworks", "joao@.com", "joao@algaworks.",
                "jo#ao@algaworks.com", "joao@alga#works.com"
        };

        for (String email : emailsValidos) {
            if (!ValidadorEmail.validar(email)) {
                throw new RuntimeException(
                        String.format("E-mail %s é válido, mas validador retornou false", email));
            }
        }

        for (String email : emailsInvalidos) {
            if (ValidadorEmail.validar(email)) {
                throw new RuntimeException(
                        String.format("E-mail %s é inválido, mas validador retornou true", email));
            }
        }

        System.out.println("Sucesso! Validador funcionando corretamente.");
    }

}
