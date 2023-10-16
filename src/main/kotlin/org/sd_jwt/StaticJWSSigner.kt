package org.sd_jwt

import com.nimbusds.jose.JWSAlgorithm
import com.nimbusds.jose.JWSSigner

public interface StaticJWSSigner: JWSSigner {

    fun getAlgorithm(): JWSAlgorithm

    fun getKeyId(): String
}