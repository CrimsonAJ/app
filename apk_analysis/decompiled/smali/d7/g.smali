.class public final synthetic Ld7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/a;


# instance fields
.field public final synthetic a:Ld7/i;

.field public final synthetic b:Lf5/q;

.field public final synthetic c:Lf5/q;

.field public final synthetic d:Ljava/util/Date;

.field public final synthetic e:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Ld7/i;Lf5/q;Lf5/q;Ljava/util/Date;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/g;->a:Ld7/i;

    iput-object p2, p0, Ld7/g;->b:Lf5/q;

    iput-object p3, p0, Ld7/g;->c:Lf5/q;

    iput-object p4, p0, Ld7/g;->d:Ljava/util/Date;

    iput-object p5, p0, Ld7/g;->e:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final i(Lf5/h;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p1, p0, Ld7/g;->d:Ljava/util/Date;

    .line 2
    .line 3
    iget-object v0, p0, Ld7/g;->e:Ljava/util/HashMap;

    .line 4
    .line 5
    iget-object v1, p0, Ld7/g;->a:Ld7/i;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Ld7/g;->b:Lf5/q;

    .line 11
    .line 12
    invoke-virtual {v2}, Lf5/q;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    new-instance p1, Lc7/f;

    .line 19
    .line 20
    invoke-virtual {v2}, Lf5/q;->f()Ljava/lang/Exception;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "Firebase Installations failed to get installation ID for fetch."

    .line 25
    .line 26
    invoke-direct {p1, v1, v0}, Ll6/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Ls8/n;->o(Ljava/lang/Exception;)Lf5/q;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    iget-object v3, p0, Ld7/g;->c:Lf5/q;

    .line 35
    .line 36
    invoke-virtual {v3}, Lf5/q;->j()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    new-instance p1, Lc7/f;

    .line 43
    .line 44
    invoke-virtual {v3}, Lf5/q;->f()Ljava/lang/Exception;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "Firebase Installations failed to get installation auth token for fetch."

    .line 49
    .line 50
    invoke-direct {p1, v1, v0}, Ll6/h;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Ls8/n;->o(Ljava/lang/Exception;)Lf5/q;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1

    .line 58
    :cond_1
    invoke-virtual {v2}, Lf5/q;->g()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v3}, Lf5/q;->g()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, LT6/a;

    .line 69
    .line 70
    iget-object v3, v3, LT6/a;->a:Ljava/lang/String;

    .line 71
    .line 72
    :try_start_0
    invoke-virtual {v1, v2, v3, p1, v0}, Ld7/i;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/HashMap;)Ld7/h;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget v0, p1, Ld7/h;->a:I

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-static {p1}, Ls8/n;->p(Ljava/lang/Object;)Lf5/q;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    goto :goto_1

    .line 85
    :catch_0
    move-exception p1

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    iget-object v0, v1, Ld7/i;->e:Ld7/d;

    .line 88
    .line 89
    iget-object v2, p1, Ld7/h;->b:Ld7/e;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v3, Lc7/c;

    .line 95
    .line 96
    const/4 v4, 0x2

    .line 97
    invoke-direct {v3, v0, v4, v2}, Lc7/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v4, v0, Ld7/d;->a:Ljava/util/concurrent/Executor;

    .line 101
    .line 102
    invoke-static {v4, v3}, Ls8/n;->e(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lf5/q;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    new-instance v5, LN1/h;

    .line 107
    .line 108
    const/4 v6, 0x7

    .line 109
    invoke-direct {v5, v0, v6, v2}, LN1/h;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v4, v5}, Lf5/q;->m(Ljava/util/concurrent/Executor;Lf5/g;)Lf5/q;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget-object v1, v1, Ld7/i;->c:Ljava/util/concurrent/Executor;

    .line 117
    .line 118
    new-instance v2, LC3/v;

    .line 119
    .line 120
    const/16 v3, 0x17

    .line 121
    .line 122
    invoke-direct {v2, v3, p1}, LC3/v;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1, v2}, Lf5/q;->m(Ljava/util/concurrent/Executor;Lf5/g;)Lf5/q;

    .line 126
    .line 127
    .line 128
    move-result-object p1
    :try_end_0
    .catch Lc7/g; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    goto :goto_1

    .line 130
    :goto_0
    invoke-static {p1}, Ls8/n;->o(Ljava/lang/Exception;)Lf5/q;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    :goto_1
    return-object p1
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
