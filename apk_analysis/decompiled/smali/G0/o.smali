.class public final LG0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LG0/k;

.field public final c:Landroid/content/Context;

.field public final d:LY7/z;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public f:I

.field public g:LG0/f;

.field public final h:Lb8/L;

.field public final i:LA1/g;

.field public final j:LG0/m;

.field public final k:LG0/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LG0/k;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, LG0/o;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p3, p0, LG0/o;->b:LG0/k;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, LG0/o;->c:Landroid/content/Context;

    .line 23
    .line 24
    iget-object p1, p3, LG0/k;->a:LG0/E;

    .line 25
    .line 26
    iget-object p1, p1, LG0/E;->a:Ld8/e;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iput-object p1, p0, LG0/o;->d:LY7/z;

    .line 31
    .line 32
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, LG0/o;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 39
    .line 40
    sget-object p1, La8/a;->a:La8/a;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-static {p2, p1}, Lb8/M;->a(ILa8/a;)Lb8/L;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, LG0/o;->h:Lb8/L;

    .line 48
    .line 49
    new-instance p1, LA1/g;

    .line 50
    .line 51
    iget-object p2, p3, LG0/k;->b:[Ljava/lang/String;

    .line 52
    .line 53
    const/16 p3, 0x15

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-direct {p1, p0, p2, p3, v0}, LA1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, LG0/o;->i:LA1/g;

    .line 60
    .line 61
    new-instance p1, LG0/m;

    .line 62
    .line 63
    invoke-direct {p1, p0}, LG0/m;-><init>(LG0/o;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, LG0/o;->j:LG0/m;

    .line 67
    .line 68
    new-instance p1, LG0/n;

    .line 69
    .line 70
    const/4 p2, 0x0

    .line 71
    invoke-direct {p1, p2, p0}, LG0/n;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, LG0/o;->k:LG0/n;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_0
    const-string p1, "coroutineScope"

    .line 78
    .line 79
    invoke-static {p1}, Lkotlin/jvm/internal/h;->h(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    throw p1
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
.method public final a(Landroid/content/Intent;)V
    .locals 12

    .line 1
    const-string v0, "serviceIntent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG0/o;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_7

    .line 15
    .line 16
    iget-object v0, p0, LG0/o;->k:LG0/n;

    .line 17
    .line 18
    iget-object v3, p0, LG0/o;->c:Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {v3, p1, v0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LG0/o;->b:LG0/k;

    .line 24
    .line 25
    iget-object v0, p0, LG0/o;->i:LA1/g;

    .line 26
    .line 27
    const-string v3, "observer"

    .line 28
    .line 29
    invoke-static {v0, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p1, LG0/k;->c:LG0/X;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v4, v0, LA1/g;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, [Ljava/lang/String;

    .line 40
    .line 41
    new-instance v5, LC7/j;

    .line 42
    .line 43
    invoke-direct {v5}, LC7/j;-><init>()V

    .line 44
    .line 45
    .line 46
    array-length v6, v4

    .line 47
    move v7, v2

    .line 48
    :goto_0
    const-string v8, "toLowerCase(...)"

    .line 49
    .line 50
    if-ge v7, v6, :cond_1

    .line 51
    .line 52
    aget-object v9, v4, v7

    .line 53
    .line 54
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 55
    .line 56
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-static {v10, v8}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v8, v3, LG0/X;->c:Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-interface {v8, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    check-cast v8, Ljava/util/Set;

    .line 70
    .line 71
    if-eqz v8, :cond_0

    .line 72
    .line 73
    invoke-virtual {v5, v8}, LC7/j;->addAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {v5, v9}, LC7/j;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-static {v5}, LO4/h;->e(LC7/j;)LC7/j;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    new-array v5, v2, [Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, [Ljava/lang/String;

    .line 94
    .line 95
    array-length v5, v4

    .line 96
    new-array v6, v5, [I

    .line 97
    .line 98
    move v7, v2

    .line 99
    :goto_2
    if-ge v7, v5, :cond_3

    .line 100
    .line 101
    aget-object v9, v4, v7

    .line 102
    .line 103
    iget-object v10, v3, LG0/X;->f:Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 106
    .line 107
    invoke-virtual {v9, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-static {v11, v8}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v10, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    check-cast v10, Ljava/lang/Integer;

    .line 119
    .line 120
    if-eqz v10, :cond_2

    .line 121
    .line 122
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    aput v9, v6, v7

    .line 127
    .line 128
    add-int/lit8 v7, v7, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 132
    .line 133
    const-string v0, "There is no table with name "

    .line 134
    .line 135
    invoke-virtual {v0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_3
    new-instance v7, LG0/t;

    .line 144
    .line 145
    invoke-direct {v7, v0, v6, v4}, LG0/t;-><init>(LA1/g;[I[Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    iget-object v4, p1, LG0/k;->e:Ljava/util/concurrent/locks/ReentrantLock;

    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 151
    .line 152
    .line 153
    iget-object p1, p1, LG0/k;->d:Ljava/util/LinkedHashMap;

    .line 154
    .line 155
    :try_start_0
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    if-eqz v8, :cond_4

    .line 160
    .line 161
    invoke-static {p1, v0}, LB7/y;->C(Ljava/util/LinkedHashMap;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, LG0/t;

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :catchall_0
    move-exception p1

    .line 169
    goto :goto_7

    .line 170
    :cond_4
    invoke-interface {p1, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    check-cast p1, LG0/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    :goto_3
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 177
    .line 178
    .line 179
    if-nez p1, :cond_7

    .line 180
    .line 181
    iget-object p1, v3, LG0/X;->h:LA6/t;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v0, p1, LA6/t;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 191
    .line 192
    .line 193
    :goto_4
    if-ge v2, v5, :cond_6

    .line 194
    .line 195
    :try_start_1
    aget v3, v6, v2

    .line 196
    .line 197
    iget-object v4, p1, LA6/t;->c:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v4, [J

    .line 200
    .line 201
    aget-wide v7, v4, v3

    .line 202
    .line 203
    const-wide/16 v9, 0x1

    .line 204
    .line 205
    add-long/2addr v9, v7

    .line 206
    aput-wide v9, v4, v3

    .line 207
    .line 208
    const-wide/16 v3, 0x0

    .line 209
    .line 210
    cmp-long v3, v7, v3

    .line 211
    .line 212
    if-nez v3, :cond_5

    .line 213
    .line 214
    iput-boolean v1, p1, LA6/t;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :catchall_1
    move-exception p1

    .line 218
    goto :goto_6

    .line 219
    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :goto_6
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 223
    .line 224
    .line 225
    throw p1

    .line 226
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :goto_7
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 231
    .line 232
    .line 233
    throw p1

    .line 234
    :cond_7
    return-void
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
