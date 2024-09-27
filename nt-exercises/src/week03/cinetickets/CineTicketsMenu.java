package week03.cinetickets;

import week03.cinetickets.models.UserModel;
import week03.cinetickets.models.enums.MovieAgeRatingEnum;
import week03.cinetickets.models.enums.MovieGenderEnum;
import week03.cinetickets.models.enums.MovieRole;
import week03.cinetickets.repositories.MovieRepository;
import week03.cinetickets.repositories.UserRepository;

import java.util.Scanner;

public class CineTicketsMenu {
    public static Scanner scan;

    private UserModel currentUser;

    public CineTicketsMenu() {
    }

    public void run() {
        this.initialMenu();
    }

    public void initialMenu() {
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("     Bem vindo ao CINE TICKETS");
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println();
        System.out.println("        1 ⯈ para Entrar");
        System.out.println("        2 ⯈ para Registrar");
        System.out.println();
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("Opção desejada?");
        System.out.print("\uD83E\uDC1A ");
        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                this.loginMenu();
                break;
            case 2:
                this.registerMenu();
                break;
            default:
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println("     Usuário ou senha inválidos!");
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println();
                System.out.println("     Rode a aplicação novamente...");
                System.out.println();
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                this.initialMenu();
        }
    }

    public void loginMenu() {
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("     Bem vindo ao CINE TICKETS");
        System.out.println();
        System.out.println("           >> ENTRAR <<");
        System.out.println();
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println();
        System.out.print("Nome de Usuário \uD83E\uDC1A ");
        String userName = scan.next();
        System.out.print("Senha \uD83E\uDC1A ");
        String password = scan.next();
        if (UserRepository.userLogin(userName, password)) {
            if (UserRepository.isClient(userName)) {
                this.customerMenu();
            } else if (UserRepository.isEmployee(userName)) {
                this.employeeMenu();
            }

            System.out.println("Login efetuado com sucesso " + userName + "!");
        } else {
            System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
            System.out.println("     Usuário ou senha inválidos!");
            System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
            this.initialMenu();
        }
    }

    public void registerMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("         _MENU DE REGISTRO_");
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println();
        System.out.println("          Dados do usuário:");
        System.out.println();

        System.out.print("Nome \uD83E\uDC1A ");
        String name = scan.next();

        System.out.print("Idade \uD83E\uDC1A ");
        int age = scan.nextInt();

        System.out.print("Nome de Usuário \uD83E\uDC1A ");
        String userName = scan.next();

        System.out.print("Senha \uD83E\uDC1A ");
        String password = scan.next();
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println();
        System.out.println("          Tipo de usuário:");
        System.out.println();
        System.out.println("        1 ⯈ para CLIENTE");
        System.out.println("        2 ⯈ para FUNCIONÁRIO");
        System.out.println();
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("Opção desejada?");
        System.out.print("\uD83E\uDC1A ");
        int userRoleOption = scan.nextInt();
        scan.nextLine();
        String option = "";
        switch (userRoleOption) {
            case 1:
                option = "CLIENTE";
                System.out.println("Cadastrando Cliente...");
                break;
            case 2:
                option = "FUNCIONÁRIO";
                System.out.println("Cadastrando Funcionário...");
                break;
            default:
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println("     Tipo de usuário inválido!");
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println("Por gentileza escolha uma das opções:");
                System.out.println();
                System.out.println("        1 ⯈ para CLIENTE");
                System.out.println("        2 ⯈ para FUNCIONÁRIO");
                System.out.println();
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                this.registerMenu();
        }

        UserRepository.userRegister(name, option, age, userName, password);
        System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
        System.out.println("   Usuário cadastrado com sucesso!");
        System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
        this.initialMenu();
    }

    public void customerMenu() {
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("            MENU CLIENTE");
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println();
        System.out.println("      1 ⯈ para Filmes em Cartaz");
        System.out.println("      2 ⯈ para SAIR");
        System.out.println();
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("Opção desejada?");
        System.out.print("\uD83E\uDC1A ");
        int choose = scan.nextInt();

        switch (choose) {
            case 1:
                System.out.println(MovieRepository.getAllMovies());
                this.customerMenu();
                break;
            case 2:
                this.initialMenu();
                break;

            default:
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println("          Número inválido!");
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println("Por gentileza escolha uma das opções:");
                System.out.println();
                System.out.println("       ⯈ 1 para MENU CLIENTE");
                System.out.println("       ⯈ 2 para SAIR");
                System.out.println();
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                this.customerMenu();
        }
    }

    public void employeeMenu() {
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("          MENU FUNCIONÁRIO");
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println();
        System.out.println("          Gerenciar Filmes:");
        System.out.println();
        System.out.println("        1 ⯈ para Cadastrar");
        System.out.println("        2 ⯈ para Remover");
        System.out.println("        3 ⯈ para Listar");
        System.out.println("        4 ⯈ para SAIR");
        System.out.println();
        System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
        System.out.println("Opção desejada?");
        System.out.print("\uD83E\uDC1A ");

        int choose = scan.nextInt();
        switch (choose) {
            case 1:
                System.out.println("ID do Filme:");
                System.out.print("\uD83E\uDC1A ");
                int movieId = scan.nextInt();

                System.out.println("Título:");
                System.out.print("\uD83E\uDC1A ");
                String movieTitle = scan.next();
                System.out.println();
                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println("               Gênero");
                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println();
                System.out.println("1 ⯈ para Filmes de AÇÃ0");
                System.out.println("2 ⯈ para Filmes de AVENTURA");
                System.out.println("3 ⯈ para Filmes de TERROR");
                System.out.println("4 ⯈ para Filmes de ANIMAÇÃO");
                System.out.println("5 ⯈ para Filmes de COMÉDIA");
                System.out.println("6 ⯈ para Filmes de DRAMA");
                System.out.println("7 ⯈ para Filmes de FICÇÃO");
                System.out.println();
                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println("Opção desejada?");
                System.out.print("\uD83E\uDC1A ");
                String movieGender = scan.next();
                MovieGenderEnum movieGenderEnum = MovieGenderEnum.movieGenderSelect(movieGender);

                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println("      Classificação indicativa");
                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println();
                System.out.println(" 0 ⯈ AL (Livre)");
                System.out.println("10 ⯈ A10 (a partir dos 10 anos)");
                System.out.println("12 ⯈ A12 (a partir dos 12 anos)");
                System.out.println("14 ⯈ A14 (a partir dos 14 anos)");
                System.out.println("16 ⯈ A16 (a partir dos 15 anos)");
                System.out.println("18 ⯈ A18 (a partir dos 18 anos)");
                System.out.println();
                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println("Opção desejada?");
                System.out.print("\uD83E\uDC1A ");
                int ageRating = scan.nextInt();
                MovieAgeRatingEnum movieAgeRatingEnum = MovieAgeRatingEnum.movieAgeRatingSelect(ageRating);

                System.out.print("Duração do Filme em minutos: ");
                System.out.print("\uD83E\uDC1A ");
                int movieDuration = scan.nextInt();

                System.out.print("Valor do ingresso: ");
                System.out.print("\uD83E\uDC1A ");
                double ticketValue = scan.nextDouble();

                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println("       Tecnologia do Filme");
                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println();
                System.out.println("      1 ⯈ para Filmes em 2D ");
                System.out.println("      2 ⯈ para Filmes em 3D");
                System.out.println();
                System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                System.out.println("Opção desejada?");
                System.out.print("\uD83E\uDC1A ");
                String movieTechnology = scan.next();
                MovieRole movieRole = MovieRole.movieTechnologySelect(movieTechnology);

                MovieRepository.movieRegister(movieId, movieTitle, movieGender, ageRating, movieDuration, ticketValue, movieRole);
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println("   Filme cadastrado com sucesso!");
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");

                this.employeeMenu();
                break;
            case 2:
                if (MovieRepository.getAllMovies() == null) {
                    System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                    System.out.println("     Nenhum filme disponível...");
                    System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                    this.employeeMenu();
                } else {
                    System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                    System.out.println("         Filmes Disponíveis");
                    System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                    System.out.println(MovieRepository.getAllMovies());
                    System.out.print("ID do Filme que deseja remover \uD83E\uDC1A ");
                    int removeMovieId = scan.nextInt();
                    if (!MovieRepository.removeMovie(removeMovieId)) {
                        System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                        System.out.println("       ID não encontrado ou");
                        System.out.println("  o filme possui ingressos vendidos!");
                        System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                        this.employeeMenu();
                    } else {
                        MovieRepository.removeMovie(removeMovieId);
                        System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                        System.out.println("    Filme removido com sucesso!");
                        System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                        this.employeeMenu();
                    }
                }
                break;
            case 3:
                if (MovieRepository.getAllMovies() == null) {
                    System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                    System.out.println("      Nenhum filme disponível...");
                    System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                    this.employeeMenu();
                } else {
                    System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                    System.out.println("         Filmes Disponíveis");
                    System.out.println("▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇▇");
                    System.out.println(MovieRepository.getAllMovies());
                    this.employeeMenu();
                }
                break;
            case 4:
                this.initialMenu();
                break;
            default:
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println("          Número inválido!");
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                System.out.println();
                System.out.println("Por gentileza escolha uma das opções:");
                System.out.println();
                System.out.println("    ⯈ 1 para Cadastrar Filme");
                System.out.println("    ⯈ 2 para Remover Filme");
                System.out.println("    ⯈ 3 para Listar Filmes");
                System.out.println("    ⯈ 4 para SAIR");
                System.out.println();
                System.out.println("┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉┉");
                employeeMenu();
        }
    }

    static {
        scan = new Scanner(System.in);
    }
}
