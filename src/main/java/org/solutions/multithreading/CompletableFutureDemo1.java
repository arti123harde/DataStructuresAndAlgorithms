//package org.solutions.multithreading;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//
///**
// * @author Arti Harde
// */
//public class CompletableFutureDemo1 {
//
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFutureDemo1 completableFutureDemo1 = new CompletableFutureDemo1();
//        System.out.println(completableFutureDemo1.completableFutureDemo());
//    }
//
//    public List<String> completableFutureDemo() throws ExecutionException, InterruptedException {
//        List<String> result = new ArrayList<>();
//        System.out.println("Starting with completableFutureDemo.......");
//        CompletableFuture<List<String>> completableFuture = CompletableFuture.supplyAsync(() -> {
//            List<String> result1 = getTable(8);
//            System.out.println("Received Result from getTable function");
//            return result1;
//        });
//        getResponse(completableFuture, result);
//        System.out.println("Ending with completableFutureDemo.......");
//        return result;
//    }
//
//    public List<String> getTable(int num) {
//        System.out.println("Starting with getTable.......");
//        List<String> result = new ArrayList<>();
//        for(int i=1; i<=50; i++){
//            result.add(String.valueOf(num * i));
//        }
//        System.out.println("Ending with getTable......." + result);
//        return result;
//    }
//
//    public CompletableFuture<Object> getResponse(CompletableFuture<Object> completableFuture, List<String> result) throws ExecutionException, InterruptedException {
//        System.out.println("Preparing String.......");
//        List<String> finalResult = result;
//        return completableFuture.thenCompose(response -> {
//                    System.out.println("Processing Result..... [" + response + "]");
//                    return getString(finalResult);
//                }).thenApply();
//    }
//
//    public String getString(List<String> list){
//        return String.join("-", list);
//    }
//}