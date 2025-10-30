.class public final Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;
.super Lo7/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/k;"
    }
.end annotation


# instance fields
.field public final a:Lk4/E;

.field public final b:Lo7/k;

.field public volatile c:Ljava/lang/reflect/Constructor;


# direct methods
.method public constructor <init>(Lo7/y;)V
    .locals 3

    .line 1
    const-string v0, "moshi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v0, "token"

    .line 10
    .line 11
    const-string v1, "provider"

    .line 12
    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lk4/E;->o([Ljava/lang/String;)Lk4/E;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;->a:Lk4/E;

    .line 22
    .line 23
    sget-object v0, LB7/v;->a:LB7/v;

    .line 24
    .line 25
    const-string v1, "idToken"

    .line 26
    .line 27
    const-class v2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v2, v0, v1}, Lo7/y;->b(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lo7/k;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;->b:Lo7/k;

    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final b(Lo7/n;)Ljava/lang/Object;
    .locals 14

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x4

    .line 5
    const/4 v4, 0x1

    .line 6
    const-string v5, "reader"

    .line 7
    .line 8
    invoke-static {p1, v5}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lo7/n;->d()V

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, -0x1

    .line 16
    move-object v8, v5

    .line 17
    move-object v9, v8

    .line 18
    move v7, v6

    .line 19
    :goto_0
    invoke-virtual {p1}, Lo7/n;->F()Z

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    const/4 v11, -0x3

    .line 24
    const-string v12, "token"

    .line 25
    .line 26
    const-string v13, "idToken"

    .line 27
    .line 28
    if-eqz v10, :cond_5

    .line 29
    .line 30
    iget-object v10, p0, Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;->a:Lk4/E;

    .line 31
    .line 32
    invoke-virtual {p1, v10}, Lo7/n;->h0(Lk4/E;)I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    if-eq v10, v6, :cond_4

    .line 37
    .line 38
    if-eqz v10, :cond_2

    .line 39
    .line 40
    if-eq v10, v4, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v7, p0, Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;->b:Lo7/k;

    .line 44
    .line 45
    invoke-virtual {v7, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    move-object v9, v7

    .line 50
    check-cast v9, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v9, :cond_1

    .line 53
    .line 54
    move v7, v11

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-string v0, "provider"

    .line 57
    .line 58
    invoke-static {v0, v0, p1}, Lp7/e;->j(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object v8, p0, Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;->b:Lo7/k;

    .line 64
    .line 65
    invoke-virtual {v8, p1}, Lo7/k;->b(Lo7/n;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    check-cast v8, Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v8, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-static {v13, v12, p1}, Lp7/e;->j(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    throw p1

    .line 79
    :cond_4
    invoke-virtual {p1}, Lo7/n;->i0()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lo7/n;->j0()V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    invoke-virtual {p1}, Lo7/n;->s()V

    .line 87
    .line 88
    .line 89
    if-ne v7, v11, :cond_7

    .line 90
    .line 91
    new-instance v0, Lcom/anilab/data/model/request/LoginWithGoogleRequest;

    .line 92
    .line 93
    if-eqz v8, :cond_6

    .line 94
    .line 95
    const-string p1, "null cannot be cast to non-null type kotlin.String"

    .line 96
    .line 97
    invoke-static {v9, p1}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, v8, v9}, Lcom/anilab/data/model/request/LoginWithGoogleRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_6
    invoke-static {v13, v12, p1}, Lp7/e;->e(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    throw p1

    .line 109
    :cond_7
    iget-object v6, p0, Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;->c:Ljava/lang/reflect/Constructor;

    .line 110
    .line 111
    if-nez v6, :cond_8

    .line 112
    .line 113
    new-array v6, v3, [Ljava/lang/Class;

    .line 114
    .line 115
    const-class v10, Ljava/lang/String;

    .line 116
    .line 117
    aput-object v10, v6, v2

    .line 118
    .line 119
    aput-object v10, v6, v4

    .line 120
    .line 121
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 122
    .line 123
    aput-object v10, v6, v1

    .line 124
    .line 125
    sget-object v10, Lp7/e;->c:Ljava/lang/Class;

    .line 126
    .line 127
    aput-object v10, v6, v0

    .line 128
    .line 129
    const-class v10, Lcom/anilab/data/model/request/LoginWithGoogleRequest;

    .line 130
    .line 131
    invoke-virtual {v10, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    iput-object v6, p0, Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;->c:Ljava/lang/reflect/Constructor;

    .line 136
    .line 137
    const-string v10, "also(...)"

    .line 138
    .line 139
    invoke-static {v6, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    if-eqz v8, :cond_9

    .line 143
    .line 144
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    new-array v3, v3, [Ljava/lang/Object;

    .line 149
    .line 150
    aput-object v8, v3, v2

    .line 151
    .line 152
    aput-object v9, v3, v4

    .line 153
    .line 154
    aput-object p1, v3, v1

    .line 155
    .line 156
    aput-object v5, v3, v0

    .line 157
    .line 158
    invoke-virtual {v6, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    const-string v0, "newInstance(...)"

    .line 163
    .line 164
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    check-cast p1, Lcom/anilab/data/model/request/LoginWithGoogleRequest;

    .line 168
    .line 169
    return-object p1

    .line 170
    :cond_9
    invoke-static {v13, v12, p1}, Lp7/e;->e(Ljava/lang/String;Ljava/lang/String;Lo7/n;)LA7/b;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    throw p1
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

.method public final e(Lo7/q;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Lcom/anilab/data/model/request/LoginWithGoogleRequest;

    .line 2
    .line 3
    const-string v0, "writer"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lo7/q;->d()Lo7/p;

    .line 11
    .line 12
    .line 13
    const-string v0, "token"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/anilab/data/model/request/LoginWithGoogleRequestJsonAdapter;->b:Lo7/k;

    .line 19
    .line 20
    iget-object v1, p2, Lcom/anilab/data/model/request/LoginWithGoogleRequest;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    const-string v1, "provider"

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lo7/q;->x(Ljava/lang/String;)Lo7/p;

    .line 28
    .line 29
    .line 30
    iget-object p2, p2, Lcom/anilab/data/model/request/LoginWithGoogleRequest;->b:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Lo7/k;->e(Lo7/q;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lo7/q;->g()Lo7/p;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 40
    .line 41
    const-string p2, "value_ was null! Wrap in .nullSafe() to write nullable values."

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x2c

    .line 2
    .line 3
    const-string v1, "GeneratedJsonAdapter(LoginWithGoogleRequest)"

    .line 4
    .line 5
    invoke-static {v0, v1}, LA0/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
.end method
