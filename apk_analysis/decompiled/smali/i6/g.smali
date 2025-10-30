.class public final Li6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU5/a;


# instance fields
.field public final a:Li6/k;

.field public final b:LU5/j;

.field public final c:I


# direct methods
.method public constructor <init>(Li6/k;LU5/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li6/g;->a:Li6/k;

    .line 5
    .line 6
    iput-object p2, p0, Li6/g;->b:LU5/j;

    .line 7
    .line 8
    iput p3, p0, Li6/g;->c:I

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.method public final a([B[B)[B
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Li6/g;->a:Li6/k;

    .line 5
    .line 6
    move-object v4, v3

    .line 7
    check-cast v4, Li6/a;

    .line 8
    .line 9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v3, p1

    .line 13
    const v5, 0x7fffffff

    .line 14
    .line 15
    .line 16
    iget v6, v4, Li6/a;->b:I

    .line 17
    .line 18
    sub-int/2addr v5, v6

    .line 19
    if-gt v3, v5, :cond_1

    .line 20
    .line 21
    array-length v3, p1

    .line 22
    add-int/2addr v3, v6

    .line 23
    new-array v8, v3, [B

    .line 24
    .line 25
    invoke-static {v6}, Li6/n;->a(I)[B

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    invoke-static {v10, v2, v8, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    array-length v7, p1

    .line 33
    const/4 v11, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    iget v9, v4, Li6/a;->b:I

    .line 36
    .line 37
    move-object v5, p1

    .line 38
    invoke-virtual/range {v4 .. v11}, Li6/a;->a([BII[BI[BZ)V

    .line 39
    .line 40
    .line 41
    if-nez p2, :cond_0

    .line 42
    .line 43
    new-array p2, v2, [B

    .line 44
    .line 45
    :cond_0
    const/16 p1, 0x8

    .line 46
    .line 47
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    array-length v4, p2

    .line 52
    int-to-long v4, v4

    .line 53
    const-wide/16 v6, 0x8

    .line 54
    .line 55
    mul-long/2addr v4, v6

    .line 56
    invoke-virtual {v3, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const/4 v3, 0x3

    .line 69
    new-array v3, v3, [[B

    .line 70
    .line 71
    aput-object p2, v3, v2

    .line 72
    .line 73
    aput-object v8, v3, v1

    .line 74
    .line 75
    aput-object p1, v3, v0

    .line 76
    .line 77
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/D1;->j([[B)[B

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object p2, p0, Li6/g;->b:LU5/j;

    .line 82
    .line 83
    invoke-interface {p2, p1}, LU5/j;->b([B)[B

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-array p2, v0, [[B

    .line 88
    .line 89
    aput-object v8, p2, v2

    .line 90
    .line 91
    aput-object p1, p2, v1

    .line 92
    .line 93
    invoke-static {p2}, Lcom/google/android/gms/internal/measurement/D1;->j([[B)[B

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 99
    .line 100
    const-string p2, "plaintext length can not exceed "

    .line 101
    .line 102
    invoke-static {v5, p2}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1
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
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
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

.method public final b([B[B)[B
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    array-length v1, p1

    .line 3
    const-string v2, "ciphertext too short"

    .line 4
    .line 5
    iget v3, p0, Li6/g;->c:I

    .line 6
    .line 7
    if-lt v1, v3, :cond_2

    .line 8
    .line 9
    array-length v1, p1

    .line 10
    sub-int/2addr v1, v3

    .line 11
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    array-length v1, p1

    .line 16
    sub-int/2addr v1, v3

    .line 17
    array-length v3, p1

    .line 18
    invoke-static {p1, v1, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    new-array p2, v0, [B

    .line 25
    .line 26
    :cond_0
    const/16 v1, 0x8

    .line 27
    .line 28
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    array-length v4, p2

    .line 33
    int-to-long v6, v4

    .line 34
    const-wide/16 v8, 0x8

    .line 35
    .line 36
    mul-long/2addr v6, v8

    .line 37
    invoke-virtual {v3, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v3, 0x3

    .line 50
    new-array v3, v3, [[B

    .line 51
    .line 52
    aput-object p2, v3, v0

    .line 53
    .line 54
    const/4 p2, 0x1

    .line 55
    aput-object v5, v3, p2

    .line 56
    .line 57
    const/4 p2, 0x2

    .line 58
    aput-object v1, v3, p2

    .line 59
    .line 60
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/D1;->j([[B)[B

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    iget-object v1, p0, Li6/g;->b:LU5/j;

    .line 65
    .line 66
    invoke-interface {v1, p1, p2}, LU5/j;->a([B[B)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Li6/g;->a:Li6/k;

    .line 70
    .line 71
    move-object v4, p1

    .line 72
    check-cast v4, Li6/a;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    array-length p1, v5

    .line 78
    iget p2, v4, Li6/a;->b:I

    .line 79
    .line 80
    if-lt p1, p2, :cond_1

    .line 81
    .line 82
    new-array v10, p2, [B

    .line 83
    .line 84
    invoke-static {v5, v0, v10, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 85
    .line 86
    .line 87
    array-length p1, v5

    .line 88
    iget v6, v4, Li6/a;->b:I

    .line 89
    .line 90
    sub-int/2addr p1, v6

    .line 91
    new-array v8, p1, [B

    .line 92
    .line 93
    array-length p1, v5

    .line 94
    sub-int v7, p1, v6

    .line 95
    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v11, 0x0

    .line 98
    invoke-virtual/range {v4 .. v11}, Li6/a;->a([BII[BI[BZ)V

    .line 99
    .line 100
    .line 101
    return-object v8

    .line 102
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 103
    .line 104
    invoke-direct {p1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 109
    .line 110
    invoke-direct {p1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1
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
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
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
