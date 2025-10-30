.class public final LW5/c;
.super LW5/d;
.source "SourceFile"


# instance fields
.field public final synthetic c:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    .line 1
    iput p3, p0, LW5/c;->c:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length p3, p1

    .line 7
    const/16 v0, 0x20

    .line 8
    .line 9
    if-ne p3, v0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, LW5/a;->c([B)[I

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, LW5/d;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iput p2, p0, LW5/d;->a:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    .line 21
    .line 22
    const-string p2, "The key length in bytes must be 32."

    .line 23
    .line 24
    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method


# virtual methods
.method public final c([II)[I
    .locals 13

    .line 1
    const/4 v0, 0x3

    .line 2
    const/16 v1, 0xd

    .line 3
    .line 4
    const/16 v2, 0xc

    .line 5
    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    iget v7, p0, LW5/c;->c:I

    .line 13
    .line 14
    packed-switch v7, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    array-length v7, p1

    .line 18
    const/4 v8, 0x6

    .line 19
    if-ne v7, v8, :cond_0

    .line 20
    .line 21
    new-array v7, v4, [I

    .line 22
    .line 23
    new-array v4, v4, [I

    .line 24
    .line 25
    iget-object v9, p0, LW5/d;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v9, [I

    .line 28
    .line 29
    sget-object v10, LW5/a;->a:[I

    .line 30
    .line 31
    array-length v11, v10

    .line 32
    invoke-static {v10, v6, v4, v6, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    array-length v11, v10

    .line 36
    invoke-static {v9, v6, v4, v11, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    .line 38
    .line 39
    aget v9, p1, v6

    .line 40
    .line 41
    aput v9, v4, v2

    .line 42
    .line 43
    aget v5, p1, v5

    .line 44
    .line 45
    aput v5, v4, v1

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    aget v5, p1, v5

    .line 49
    .line 50
    const/16 v9, 0xe

    .line 51
    .line 52
    aput v5, v4, v9

    .line 53
    .line 54
    aget v0, p1, v0

    .line 55
    .line 56
    const/16 v5, 0xf

    .line 57
    .line 58
    aput v0, v4, v5

    .line 59
    .line 60
    invoke-static {v4}, LW5/a;->b([I)V

    .line 61
    .line 62
    .line 63
    aget v0, v4, v2

    .line 64
    .line 65
    const/4 v11, 0x4

    .line 66
    aput v0, v4, v11

    .line 67
    .line 68
    aget v0, v4, v1

    .line 69
    .line 70
    const/4 v12, 0x5

    .line 71
    aput v0, v4, v12

    .line 72
    .line 73
    aget v0, v4, v9

    .line 74
    .line 75
    aput v0, v4, v8

    .line 76
    .line 77
    const/4 v0, 0x7

    .line 78
    aget v8, v4, v5

    .line 79
    .line 80
    aput v8, v4, v0

    .line 81
    .line 82
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    array-length v4, v10

    .line 87
    invoke-static {v10, v6, v7, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 88
    .line 89
    .line 90
    array-length v4, v10

    .line 91
    invoke-static {v0, v6, v7, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    .line 93
    .line 94
    aput p2, v7, v2

    .line 95
    .line 96
    aput v6, v7, v1

    .line 97
    .line 98
    aget p2, p1, v11

    .line 99
    .line 100
    aput p2, v7, v9

    .line 101
    .line 102
    aget p1, p1, v12

    .line 103
    .line 104
    aput p1, v7, v5

    .line 105
    .line 106
    return-object v7

    .line 107
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    array-length p1, p1

    .line 110
    mul-int/lit8 p1, p1, 0x20

    .line 111
    .line 112
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-array v0, v5, [Ljava/lang/Object;

    .line 117
    .line 118
    aput-object p1, v0, v6

    .line 119
    .line 120
    const-string p1, "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"

    .line 121
    .line 122
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p2

    .line 130
    :pswitch_0
    array-length v7, p1

    .line 131
    if-ne v7, v0, :cond_1

    .line 132
    .line 133
    new-array v0, v4, [I

    .line 134
    .line 135
    iget-object v4, p0, LW5/d;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, [I

    .line 138
    .line 139
    sget-object v5, LW5/a;->a:[I

    .line 140
    .line 141
    array-length v7, v5

    .line 142
    invoke-static {v5, v6, v0, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 143
    .line 144
    .line 145
    array-length v5, v5

    .line 146
    invoke-static {v4, v6, v0, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 147
    .line 148
    .line 149
    aput p2, v0, v2

    .line 150
    .line 151
    array-length p2, p1

    .line 152
    invoke-static {p1, v6, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 153
    .line 154
    .line 155
    return-object v0

    .line 156
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 157
    .line 158
    array-length p1, p1

    .line 159
    mul-int/lit8 p1, p1, 0x20

    .line 160
    .line 161
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    new-array v0, v5, [Ljava/lang/Object;

    .line 166
    .line 167
    aput-object p1, v0, v6

    .line 168
    .line 169
    const-string p1, "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"

    .line 170
    .line 171
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p2

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

.method public final i()I
    .locals 1

    .line 1
    iget v0, p0, LW5/c;->c:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x18

    return v0

    :pswitch_0
    const/16 v0, 0xc

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
