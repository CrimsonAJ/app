.class public final LL1/q;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public r:Lc7/e;

.field public s:I

.field public final synthetic t:LL2/a;


# direct methods
.method public constructor <init>(LL2/a;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL1/q;->t:LL2/a;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
    .locals 1

    .line 1
    new-instance p1, LL1/q;

    .line 2
    .line 3
    iget-object v0, p0, LL1/q;->t:LL2/a;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LL1/q;-><init>(LL2/a;LE7/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
    .line 9
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LL1/q;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LL1/q;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LL1/q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    sget-object v1, LF7/a;->a:LF7/a;

    .line 4
    .line 5
    iget v2, p0, LL1/q;->s:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LL1/q;->r:Lc7/e;

    .line 13
    .line 14
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/google/android/gms/internal/measurement/D1;->v()Lc7/e;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v2, p1, Lc7/e;->e:Ld7/i;

    .line 34
    .line 35
    iget-object v4, v2, Ld7/i;->g:Ld7/m;

    .line 36
    .line 37
    sget-wide v5, Ld7/i;->i:J

    .line 38
    .line 39
    iget-object v4, v4, Ld7/m;->a:Landroid/content/SharedPreferences;

    .line 40
    .line 41
    const-string v7, "minimum_fetch_interval_in_seconds"

    .line 42
    .line 43
    invoke-interface {v4, v7, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    new-instance v6, Ljava/util/HashMap;

    .line 48
    .line 49
    iget-object v7, v2, Ld7/i;->h:Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-direct {v6, v7}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    const-string v7, "BASE/1"

    .line 55
    .line 56
    const-string v8, "X-Firebase-RC-Fetch-Type"

    .line 57
    .line 58
    invoke-virtual {v6, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object v7, v2, Ld7/i;->e:Ld7/d;

    .line 62
    .line 63
    invoke-virtual {v7}, Ld7/d;->b()Lf5/h;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    new-instance v8, Ld7/f;

    .line 68
    .line 69
    invoke-direct {v8, v2, v4, v5, v6}, Ld7/f;-><init>(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, v2, Ld7/i;->c:Ljava/util/concurrent/Executor;

    .line 73
    .line 74
    invoke-virtual {v7, v2, v8}, Lf5/h;->e(Ljava/util/concurrent/Executor;Lf5/a;)Lf5/q;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget-object v4, Lt6/i;->a:Lt6/i;

    .line 79
    .line 80
    new-instance v5, LX0/k;

    .line 81
    .line 82
    const/16 v6, 0xa

    .line 83
    .line 84
    invoke-direct {v5, v6}, LX0/k;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4, v5}, Lf5/q;->m(Ljava/util/concurrent/Executor;Lf5/g;)Lf5/q;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v4, Lc7/b;

    .line 92
    .line 93
    invoke-direct {v4, p1}, Lc7/b;-><init>(Lc7/e;)V

    .line 94
    .line 95
    .line 96
    iget-object v5, p1, Lc7/e;->b:Ljava/util/concurrent/Executor;

    .line 97
    .line 98
    invoke-virtual {v2, v5, v4}, Lf5/q;->m(Ljava/util/concurrent/Executor;Lf5/g;)Lf5/q;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iput-object p1, p0, LL1/q;->r:Lc7/e;

    .line 103
    .line 104
    iput v3, p0, LL1/q;->s:I

    .line 105
    .line 106
    invoke-static {v2, p0}, Lcom/google/android/gms/internal/measurement/Y1;->a(Lf5/q;LG7/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-ne v2, v1, :cond_2

    .line 111
    .line 112
    return-object v1

    .line 113
    :cond_2
    move-object v1, p1

    .line 114
    move-object p1, v2

    .line 115
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    invoke-virtual {v1}, Lc7/e;->a()Ljava/util/HashMap;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-static {v2}, LB7/y;->D(I)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_5

    .line 153
    .line 154
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Ljava/util/Map$Entry;

    .line 159
    .line 160
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    :try_start_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Ld7/o;

    .line 169
    .line 170
    iget v4, v2, Ld7/o;->b:I

    .line 171
    .line 172
    if-nez v4, :cond_3

    .line 173
    .line 174
    move-object v2, v0

    .line 175
    goto :goto_2

    .line 176
    :cond_3
    iget-object v2, v2, Ld7/o;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :catchall_0
    move-exception v2

    .line 180
    invoke-static {v2}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    :goto_2
    instance-of v4, v2, LA7/i;

    .line 185
    .line 186
    if-eqz v4, :cond_4

    .line 187
    .line 188
    move-object v2, v0

    .line 189
    :cond_4
    check-cast v2, Ljava/lang/String;

    .line 190
    .line 191
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_5
    iget-object p1, p0, LL1/q;->t:LL2/a;

    .line 196
    .line 197
    invoke-virtual {p1, v1}, LL2/a;->a(Ljava/util/LinkedHashMap;)V

    .line 198
    .line 199
    .line 200
    :cond_6
    sget-object p1, LA7/n;->a:LA7/n;

    .line 201
    .line 202
    return-object p1
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
