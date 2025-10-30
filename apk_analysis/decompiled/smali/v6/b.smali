.class public final Lv6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE6/e;


# direct methods
.method public constructor <init>(LE6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv6/b;->a:LE6/e;

    .line 5
    .line 6
    return-void
    .line 7
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
.end method


# virtual methods
.method public final a(Lg7/d;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lv6/b;->a:LE6/e;

    .line 3
    .line 4
    iget-object p1, p1, Lg7/d;->a:Ljava/util/HashSet;

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v3, 0xa

    .line 9
    .line 10
    invoke-static {p1, v3}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lg7/e;

    .line 32
    .line 33
    check-cast v3, Lg7/c;

    .line 34
    .line 35
    iget-object v5, v3, Lg7/c;->b:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v6, v3, Lg7/c;->d:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v4, v3, Lg7/c;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v8, v3, Lg7/c;->c:Ljava/lang/String;

    .line 42
    .line 43
    iget-wide v9, v3, Lg7/c;->f:J

    .line 44
    .line 45
    sget-object v3, LA6/o;->a:Lo1/f;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/16 v7, 0x100

    .line 52
    .line 53
    if-le v3, v7, :cond_0

    .line 54
    .line 55
    invoke-virtual {v4, v0, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :cond_0
    move-object v7, v4

    .line 60
    new-instance v4, LA6/b;

    .line 61
    .line 62
    invoke-direct/range {v4 .. v10}, LA6/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object p1, v1, LE6/e;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, LA6/p;

    .line 72
    .line 73
    monitor-enter p1

    .line 74
    :try_start_0
    iget-object v3, v1, LE6/e;->f:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, LA6/p;

    .line 77
    .line 78
    invoke-virtual {v3, v2}, LA6/p;->c(Ljava/util/List;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_2

    .line 83
    .line 84
    monitor-exit p1

    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    iget-object v2, v1, LE6/e;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, LA6/p;

    .line 91
    .line 92
    invoke-virtual {v2}, LA6/p;->a()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget-object v3, v1, LE6/e;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Lz6/d;

    .line 99
    .line 100
    iget-object v3, v3, Lz6/d;->b:Lz6/b;

    .line 101
    .line 102
    new-instance v4, LA6/r;

    .line 103
    .line 104
    invoke-direct {v4, v1, v0, v2}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v4}, Lz6/b;->a(Ljava/lang/Runnable;)Lf5/q;

    .line 108
    .line 109
    .line 110
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    :goto_1
    const-string p1, "Updated Crashlytics Rollout State"

    .line 112
    .line 113
    const-string v0, "FirebaseCrashlytics"

    .line 114
    .line 115
    const/4 v1, 0x3

    .line 116
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_3

    .line 121
    .line 122
    const-string v0, "FirebaseCrashlytics"

    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    invoke-static {v0, p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 126
    .line 127
    .line 128
    :cond_3
    return-void

    .line 129
    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    throw v0
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
