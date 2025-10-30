.class public final LE2/c;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:LG7/j;


# direct methods
.method public constructor <init>(LO7/p;LE7/d;)V
    .locals 0

    .line 1
    check-cast p1, LG7/j;

    .line 2
    .line 3
    iput-object p1, p0, LE2/c;->t:LG7/j;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance v0, LE2/c;

    .line 2
    .line 3
    iget-object v1, p0, LE2/c;->t:LG7/j;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LE2/c;-><init>(LO7/p;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LE2/c;->s:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LE2/c;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LE2/c;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LE2/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, LF7/a;->a:LF7/a;

    .line 2
    .line 3
    iget v1, p0, LE2/c;->r:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    :try_start_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LE2/c;->s:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LY7/z;

    .line 30
    .line 31
    :try_start_1
    iget-object v1, p0, LE2/c;->t:LG7/j;

    .line 32
    .line 33
    iput v2, p0, LE2/c;->r:I

    .line 34
    .line 35
    invoke-interface {v1, p1, p0}, LO7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    check-cast p1, Lv2/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    return-object p1

    .line 45
    :goto_1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 46
    .line 47
    if-nez v0, :cond_d

    .line 48
    .line 49
    instance-of v0, p1, Lz8/o;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    if-eqz v0, :cond_a

    .line 53
    .line 54
    move-object v0, p1

    .line 55
    check-cast v0, Lz8/o;

    .line 56
    .line 57
    const/16 v2, 0x190

    .line 58
    .line 59
    iget v3, v0, Lz8/o;->a:I

    .line 60
    .line 61
    if-eq v3, v2, :cond_5

    .line 62
    .line 63
    const/16 v0, 0x191

    .line 64
    .line 65
    if-eq v3, v0, :cond_4

    .line 66
    .line 67
    const/16 v0, 0x198

    .line 68
    .line 69
    if-eq v3, v0, :cond_3

    .line 70
    .line 71
    new-instance v0, Lv2/a;

    .line 72
    .line 73
    new-instance v2, Lu2/a;

    .line 74
    .line 75
    invoke-direct {v2, v1, p1}, Lu2/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v2}, Lv2/a;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_4

    .line 82
    .line 83
    :cond_3
    new-instance v0, Lv2/a;

    .line 84
    .line 85
    new-instance v1, Lu2/e;

    .line 86
    .line 87
    check-cast p1, Lz8/o;

    .line 88
    .line 89
    invoke-direct {v1, p1}, Lu2/e;-><init>(Lz8/o;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v1}, Lv2/a;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_4

    .line 96
    .line 97
    :cond_4
    new-instance v0, Lv2/a;

    .line 98
    .line 99
    new-instance p1, Lu2/b;

    .line 100
    .line 101
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, p1}, Lv2/a;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :cond_5
    iget-object v0, v0, Lz8/o;->b:Lz8/O;

    .line 110
    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    iget-object v0, v0, Lz8/O;->c:Li8/M;

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    invoke-virtual {v0}, Li8/N;->s()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    goto :goto_2

    .line 122
    :cond_6
    move-object v0, v1

    .line 123
    :goto_2
    if-nez v0, :cond_7

    .line 124
    .line 125
    const-string v0, ""

    .line 126
    .line 127
    :cond_7
    sget-object v2, LE2/d;->a:Lo7/y;

    .line 128
    .line 129
    :try_start_2
    const-class v3, Lcom/anilab/data/model/response/ErrorResponse;

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Lo7/y;->a(Ljava/lang/Class;)Lo7/k;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2, v0}, Lo7/k;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Lcom/anilab/data/model/response/ErrorResponse;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :goto_3
    instance-of v2, v0, LA7/i;

    .line 148
    .line 149
    if-eqz v2, :cond_8

    .line 150
    .line 151
    move-object v0, v1

    .line 152
    :cond_8
    check-cast v0, Lcom/anilab/data/model/response/ErrorResponse;

    .line 153
    .line 154
    new-instance v2, Lv2/a;

    .line 155
    .line 156
    new-instance v3, Lu2/a;

    .line 157
    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    iget-object v1, v0, Lcom/anilab/data/model/response/ErrorResponse;->a:Ljava/lang/String;

    .line 161
    .line 162
    :cond_9
    invoke-direct {v3, v1, p1}, Lu2/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v2, v3}, Lv2/a;-><init>(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    move-object v0, v2

    .line 169
    goto :goto_4

    .line 170
    :cond_a
    instance-of v0, p1, Lu2/b;

    .line 171
    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    new-instance v0, Lv2/a;

    .line 175
    .line 176
    new-instance p1, Lu2/b;

    .line 177
    .line 178
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 179
    .line 180
    .line 181
    invoke-direct {v0, p1}, Lv2/a;-><init>(Ljava/lang/Throwable;)V

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_b
    instance-of v0, p1, Ljava/io/IOException;

    .line 186
    .line 187
    if-eqz v0, :cond_c

    .line 188
    .line 189
    new-instance v0, Lv2/a;

    .line 190
    .line 191
    new-instance v1, Lu2/c;

    .line 192
    .line 193
    check-cast p1, Ljava/io/IOException;

    .line 194
    .line 195
    invoke-direct {v1, p1}, Lu2/c;-><init>(Ljava/io/IOException;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v0, v1}, Lv2/a;-><init>(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_c
    new-instance v0, Lv2/a;

    .line 203
    .line 204
    new-instance v2, Lu2/a;

    .line 205
    .line 206
    invoke-direct {v2, v1, p1}, Lu2/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    invoke-direct {v0, v2}, Lv2/a;-><init>(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    return-object v0

    .line 213
    :cond_d
    throw p1
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
