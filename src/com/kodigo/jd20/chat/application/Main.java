package com.kodigo.jd20.chat.application;

import com.kodigo.jd20.chat.model.*;
import com.kodigo.jd20.chat.service.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IUserService userService = new UserService();
        IChatService chatService = new ChatService();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del Usuario 1: ");
        String name1 = scanner.nextLine();
        User user1 = userService.createUser(name1);

        System.out.print("Nombre del Usuario 2: ");
        String name2 = scanner.nextLine();
        User user2 = userService.createUser(name2);

        Chat chat = chatService.createChat();
        chatService.addUserToChat(chat.getId(), user1);
        chatService.addUserToChat(chat.getId(), user2);

        boolean running = true;
        while (running) {
            System.out.println("\n[1] Enviar Mensaje de Texto");
            System.out.println("[2] Enviar Imagen");
            System.out.println("[3] Enviar Audio");
            System.out.println("[4] Ver Historial");
            System.out.println("[0] Salir");
            System.out.print("Opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (option) {
                case 1 -> {
                    User sender = selectSender(scanner, user1, user2);
                    System.out.print("Mensaje: ");
                    String content = scanner.nextLine();
                    IMessage message = new Message(sender, content, LocalDateTime.now());
                    chatService.sendMessage(chat.getId(), sender, message);
                }
                case 2 -> {
                    User sender = selectSender(scanner, user1, user2);
                    System.out.print("URL de la imagen: ");
                    String imageUrl = scanner.nextLine();
                    IMessage message = new ImageMessage(sender, imageUrl, LocalDateTime.now());
                    chatService.sendMessage(chat.getId(), sender, message);
                }
                case 3 -> {
                    User sender = selectSender(scanner, user1, user2);
                    System.out.print("URL del audio: ");
                    String audioUrl = scanner.nextLine();
                    IMessage message = new VoiceMessage(sender, audioUrl, LocalDateTime.now());
                    chatService.sendMessage(chat.getId(), sender, message);
                }
                case 4 -> {
                    System.out.println("\n--- Historial del Chat ---");
                    chatService.getMessages(chat.getId());
                }
                case 0 -> {
                    running = false;
                    System.out.println("¡Hasta luego!");
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    private static User selectSender(Scanner scanner, User user1, User user2) {
        System.out.print("¿Quién envía el mensaje? (1 o 2): ");
        int senderOpt = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer
        return (senderOpt == 1) ? user1 : user2;
    }
}
