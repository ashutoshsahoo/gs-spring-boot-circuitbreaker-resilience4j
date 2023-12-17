package com.ashu.practice.service;

public interface AlbumService {

    String failure();

    String failureWithFallback();

    String success();

    String successException();

    String ignoreException();
    String getAlbumList();
}
