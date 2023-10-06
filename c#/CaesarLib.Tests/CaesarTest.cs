using CaesarLib;
using FluentAssertions;
namespace CaesarLib.Tests;

public class CaesarTest
{
    [Fact]
    public void Encryption_Returns_Expected_Result()
    {
        const string expectedOutput = "DEXXEGOD";
        const int shift = 4;
        const string input = "ZATTACKZ";

        var encrypted = Caesar.Encrypt(input,shift);
        encrypted.Should().Be(expectedOutput);
    }

    [Fact]
    public void Decryption_Returns_Expected_Result()
    {
        const string expectedOutput = "ZATTACKZ";
        const int shift = 4;
        const string input = "DEXXEGOD";

        var decrypted = Caesar.Decrypt(input,shift);
        decrypted.Should().Be(expectedOutput);
    }

    [Fact]
    public void RoundTrip_Yields_Equivalent(){
        var input ="ZATTACKZ";
        const int shift = 4;

        var encrypted = Caesar.Encrypt(input,shift);
        var output = Caesar.Decrypt(encrypted,shift);

        output.Should().Be(input);
    }
}