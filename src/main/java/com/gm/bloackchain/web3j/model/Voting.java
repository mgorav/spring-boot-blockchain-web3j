package com.gm.bloackchain.web3j.model;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.3.1.
 */
public class Voting extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b506040516102f23803806102f283398101604052805101805161003a906001906020840190610041565b50506100ab565b82805482825590600052602060002090810192821561007e579160200282015b8281111561007e5782518255602090920191600190910190610061565b5061008a92915061008e565b5090565b6100a891905b8082111561008a5760008155600101610094565b90565b610238806100ba6000396000f30060806040526004361061006c5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416632f265cf78114610071578063392e66781461009f5780637021939f146100cb578063b13c744b146100e3578063cc9ab2671461010d575b600080fd5b34801561007d57600080fd5b50610089600435610127565b6040805160ff9092168252519081900360200190f35b3480156100ab57600080fd5b506100b7600435610153565b604080519115158252519081900360200190f35b3480156100d757600080fd5b506100896004356101a0565b3480156100ef57600080fd5b506100fb6004356101b5565b60408051918252519081900360200190f35b34801561011957600080fd5b506101256004356101d4565b005b600061013282610153565b151561013d57600080fd5b5060009081526020819052604090205460ff1690565b6000805b60015481101561019557600180548491908390811061017257fe5b600091825260209091200154141561018d576001915061019a565b600101610157565b600091505b50919050565b60006020819052908152604090205460ff1681565b60018054829081106101c357fe5b600091825260209091200154905081565b6101dd81610153565b15156101e857600080fd5b6000908152602081905260409020805460ff8082166001011660ff199091161790555600a165627a7a723058205ed8289d2c1198057008c4eb35608e7db4a4dbc168d3402c21220308d96660b20029";

    protected Voting(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Voting(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<BigInteger> totalVotesFor(byte[] candidate) {
        final Function function = new Function("totalVotesFor", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(candidate)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> validCandidate(byte[] candidate) {
        final Function function = new Function("validCandidate", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(candidate)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<BigInteger> votesReceived(byte[] param0) {
        final Function function = new Function("votesReceived", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> candidateList(BigInteger param0) {
        final Function function = new Function("candidateList", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> voteForCandidate(byte[] candidate) {
        final Function function = new Function(
                "voteForCandidate", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(candidate)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Voting> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, List<byte[]> candidateNames) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(candidateNames, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Voting.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Voting> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, List<byte[]> candidateNames) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(candidateNames, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Voting.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Voting load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Voting(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Voting load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Voting(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
