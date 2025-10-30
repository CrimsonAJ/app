.class public final LB6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL6/d;


# static fields
.field public static final a:LB6/j;

.field public static final b:LL6/c;

.field public static final c:LL6/c;

.field public static final d:LL6/c;

.field public static final e:LL6/c;

.field public static final f:LL6/c;

.field public static final g:LL6/c;

.field public static final h:LL6/c;

.field public static final i:LL6/c;

.field public static final j:LL6/c;

.field public static final k:LL6/c;

.field public static final l:LL6/c;

.field public static final m:LL6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LB6/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LB6/j;->a:LB6/j;

    .line 7
    .line 8
    const-string v0, "generator"

    .line 9
    .line 10
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LB6/j;->b:LL6/c;

    .line 15
    .line 16
    const-string v0, "identifier"

    .line 17
    .line 18
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, LB6/j;->c:LL6/c;

    .line 23
    .line 24
    const-string v0, "appQualitySessionId"

    .line 25
    .line 26
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, LB6/j;->d:LL6/c;

    .line 31
    .line 32
    const-string v0, "startedAt"

    .line 33
    .line 34
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LB6/j;->e:LL6/c;

    .line 39
    .line 40
    const-string v0, "endedAt"

    .line 41
    .line 42
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, LB6/j;->f:LL6/c;

    .line 47
    .line 48
    const-string v0, "crashed"

    .line 49
    .line 50
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, LB6/j;->g:LL6/c;

    .line 55
    .line 56
    const-string v0, "app"

    .line 57
    .line 58
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, LB6/j;->h:LL6/c;

    .line 63
    .line 64
    const-string v0, "user"

    .line 65
    .line 66
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, LB6/j;->i:LL6/c;

    .line 71
    .line 72
    const-string v0, "os"

    .line 73
    .line 74
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, LB6/j;->j:LL6/c;

    .line 79
    .line 80
    const-string v0, "device"

    .line 81
    .line 82
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sput-object v0, LB6/j;->k:LL6/c;

    .line 87
    .line 88
    const-string v0, "events"

    .line 89
    .line 90
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sput-object v0, LB6/j;->l:LL6/c;

    .line 95
    .line 96
    const-string v0, "generatorType"

    .line 97
    .line 98
    invoke-static {v0}, LL6/c;->a(Ljava/lang/String;)LL6/c;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sput-object v0, LB6/j;->m:LL6/c;

    .line 103
    .line 104
    return-void
    .line 105
    .line 106
    .line 107
    .line 108
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, LB6/N0;

    .line 2
    .line 3
    check-cast p2, LL6/e;

    .line 4
    .line 5
    check-cast p1, LB6/J;

    .line 6
    .line 7
    iget-object v0, p1, LB6/J;->a:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v1, LB6/j;->b:LL6/c;

    .line 10
    .line 11
    invoke-interface {p2, v1, v0}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 12
    .line 13
    .line 14
    sget-object v0, LB6/O0;->a:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    iget-object v1, p1, LB6/J;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, LB6/j;->c:LL6/c;

    .line 23
    .line 24
    invoke-interface {p2, v1, v0}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 25
    .line 26
    .line 27
    sget-object v0, LB6/j;->d:LL6/c;

    .line 28
    .line 29
    iget-object v1, p1, LB6/J;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-interface {p2, v0, v1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 32
    .line 33
    .line 34
    sget-object v0, LB6/j;->e:LL6/c;

    .line 35
    .line 36
    iget-wide v1, p1, LB6/J;->d:J

    .line 37
    .line 38
    invoke-interface {p2, v0, v1, v2}, LL6/e;->f(LL6/c;J)LL6/e;

    .line 39
    .line 40
    .line 41
    sget-object v0, LB6/j;->f:LL6/c;

    .line 42
    .line 43
    iget-object v1, p1, LB6/J;->e:Ljava/lang/Long;

    .line 44
    .line 45
    invoke-interface {p2, v0, v1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 46
    .line 47
    .line 48
    sget-object v0, LB6/j;->g:LL6/c;

    .line 49
    .line 50
    iget-boolean v1, p1, LB6/J;->f:Z

    .line 51
    .line 52
    invoke-interface {p2, v0, v1}, LL6/e;->b(LL6/c;Z)LL6/e;

    .line 53
    .line 54
    .line 55
    sget-object v0, LB6/j;->h:LL6/c;

    .line 56
    .line 57
    iget-object v1, p1, LB6/J;->g:LB6/K;

    .line 58
    .line 59
    invoke-interface {p2, v0, v1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 60
    .line 61
    .line 62
    sget-object v0, LB6/j;->i:LL6/c;

    .line 63
    .line 64
    iget-object v1, p1, LB6/J;->h:LB6/k0;

    .line 65
    .line 66
    invoke-interface {p2, v0, v1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 67
    .line 68
    .line 69
    sget-object v0, LB6/j;->j:LL6/c;

    .line 70
    .line 71
    iget-object v1, p1, LB6/J;->i:LB6/j0;

    .line 72
    .line 73
    invoke-interface {p2, v0, v1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 74
    .line 75
    .line 76
    sget-object v0, LB6/j;->k:LL6/c;

    .line 77
    .line 78
    iget-object v1, p1, LB6/J;->j:LB6/N;

    .line 79
    .line 80
    invoke-interface {p2, v0, v1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 81
    .line 82
    .line 83
    sget-object v0, LB6/j;->l:LL6/c;

    .line 84
    .line 85
    iget-object v1, p1, LB6/J;->k:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {p2, v0, v1}, LL6/e;->a(LL6/c;Ljava/lang/Object;)LL6/e;

    .line 88
    .line 89
    .line 90
    sget-object v0, LB6/j;->m:LL6/c;

    .line 91
    .line 92
    iget p1, p1, LB6/J;->l:I

    .line 93
    .line 94
    invoke-interface {p2, v0, p1}, LL6/e;->e(LL6/c;I)LL6/e;

    .line 95
    .line 96
    .line 97
    return-void
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
