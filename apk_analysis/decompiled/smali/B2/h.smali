.class public final LB2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/z;


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lg6/o;->a:Lg6/o;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg6/o;->n()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, LB2/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    return-void
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
.end method


# virtual methods
.method public final a(Lo8/d;)Li8/L;
    .locals 8

    .line 1
    sget-object v0, LB2/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    const-string v1, "value"

    .line 4
    .line 5
    iget-object v2, p1, Lo8/d;->e:Li8/G;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1, v2}, Lo8/d;->b(Li8/G;)Li8/L;

    .line 8
    .line 9
    .line 10
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 11
    const/16 v4, 0x1f4

    .line 12
    .line 13
    iget v5, v3, Li8/L;->d:I

    .line 14
    .line 15
    if-le v5, v4, :cond_0

    .line 16
    .line 17
    sget-object v4, Lg6/o;->a:Lg6/o;

    .line 18
    .line 19
    invoke-virtual {v4}, Lg6/o;->o()[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {}, Lcom/google/android/gms/internal/measurement/D1;->o()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v4, v5}, LB7/j;->l0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    array-length v6, v4

    .line 32
    add-int/lit8 v6, v6, -0x1

    .line 33
    .line 34
    add-int/2addr v6, v5

    .line 35
    if-ge v5, v6, :cond_0

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {v3}, Li8/L;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 38
    .line 39
    .line 40
    :catch_0
    add-int/lit8 v5, v5, 0x1

    .line 41
    .line 42
    :try_start_2
    array-length v3, v4

    .line 43
    rem-int/2addr v5, v3

    .line 44
    aget-object v3, v4, v5

    .line 45
    .line 46
    invoke-static {v3, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v2, Li8/G;->a:Li8/y;

    .line 53
    .line 54
    invoke-virtual {v0}, Li8/y;->f()Li8/x;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {}, Lcom/google/android/gms/internal/measurement/D1;->o()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v3, Lg6/o;->a:Lg6/o;

    .line 63
    .line 64
    invoke-virtual {v3}, Lg6/o;->M()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v1, v3}, LW7/d;->Y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Li8/x;->d(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Li8/x;->b()Li8/y;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, Li8/G;->b()LY2/r;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v0, v1, LY2/r;->a:Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {v1}, LY2/r;->o()Li8/G;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1, v0}, Lo8/d;->b(Li8/G;)Li8/L;

    .line 90
    .line 91
    .line 92
    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 93
    return-object p1

    .line 94
    :catch_1
    move-exception p1

    .line 95
    goto :goto_0

    .line 96
    :catch_2
    move-exception p1

    .line 97
    goto :goto_1

    .line 98
    :goto_0
    new-instance v0, Ljava/io/IOException;

    .line 99
    .line 100
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :goto_1
    throw p1

    .line 105
    :cond_0
    return-object v3

    .line 106
    :catch_3
    move-exception v3

    .line 107
    instance-of v4, v3, Ljava/net/UnknownHostException;

    .line 108
    .line 109
    if-nez v4, :cond_2

    .line 110
    .line 111
    instance-of v4, v3, Ljavax/net/ssl/SSLException;

    .line 112
    .line 113
    if-nez v4, :cond_2

    .line 114
    .line 115
    instance-of v4, v3, Ljava/net/SocketTimeoutException;

    .line 116
    .line 117
    if-eqz v4, :cond_1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    throw v3

    .line 121
    :cond_2
    :goto_2
    sget-object v4, Lg6/o;->a:Lg6/o;

    .line 122
    .line 123
    invoke-virtual {v4}, Lg6/o;->o()[Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-static {}, Lcom/google/android/gms/internal/measurement/D1;->o()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-static {v5, v6}, LB7/j;->l0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    array-length v7, v5

    .line 136
    add-int/lit8 v7, v7, -0x1

    .line 137
    .line 138
    add-int/2addr v7, v6

    .line 139
    if-ge v6, v7, :cond_3

    .line 140
    .line 141
    add-int/lit8 v6, v6, 0x1

    .line 142
    .line 143
    :try_start_3
    array-length v7, v5

    .line 144
    rem-int/2addr v6, v7

    .line 145
    aget-object v5, v5, v6

    .line 146
    .line 147
    invoke-static {v5, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v2, Li8/G;->a:Li8/y;

    .line 154
    .line 155
    invoke-virtual {v0}, Li8/y;->f()Li8/x;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {}, Lcom/google/android/gms/internal/measurement/D1;->o()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v4}, Lg6/o;->M()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v1, v4}, LW7/d;->Y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v0, v1}, Li8/x;->d(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Li8/x;->b()Li8/y;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v2}, Li8/G;->b()LY2/r;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    iput-object v0, v1, LY2/r;->a:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-virtual {v1}, LY2/r;->o()Li8/G;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {p1, v0}, Lo8/d;->b(Li8/G;)Li8/L;

    .line 189
    .line 190
    .line 191
    move-result-object p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    .line 192
    return-object p1

    .line 193
    :catch_4
    move-exception p1

    .line 194
    goto :goto_3

    .line 195
    :catch_5
    throw v3

    .line 196
    :goto_3
    throw p1

    .line 197
    :cond_3
    throw v3
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
