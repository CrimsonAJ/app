.class public final LY2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL6/d;


# static fields
.field public static final a:LY2/f;

.field public static final b:LL6/c;

.field public static final c:LL6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LY2/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY2/f;->a:LY2/f;

    .line 7
    .line 8
    new-instance v0, LO6/a;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, LO6/a;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-class v1, LO6/e;

    .line 15
    .line 16
    invoke-static {v1, v0}, LA0/a;->r(Ljava/lang/Class;LO6/a;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v2, LL6/c;

    .line 21
    .line 22
    invoke-static {v0}, LA0/a;->s(Ljava/util/HashMap;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v3, "currentCacheSizeBytes"

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, LL6/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, LY2/f;->b:LL6/c;

    .line 32
    .line 33
    new-instance v0, LO6/a;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-direct {v0, v2}, LO6/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v0}, LA0/a;->r(Ljava/lang/Class;LO6/a;)Ljava/util/HashMap;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, LL6/c;

    .line 44
    .line 45
    invoke-static {v0}, LA0/a;->s(Ljava/util/HashMap;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "maxCacheSizeBytes"

    .line 50
    .line 51
    invoke-direct {v1, v2, v0}, LL6/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, LY2/f;->c:LL6/c;

    .line 55
    .line 56
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lb3/f;

    .line 2
    .line 3
    check-cast p2, LL6/e;

    .line 4
    .line 5
    iget-wide v0, p1, Lb3/f;->a:J

    .line 6
    .line 7
    sget-object v2, LY2/f;->b:LL6/c;

    .line 8
    .line 9
    invoke-interface {p2, v2, v0, v1}, LL6/e;->f(LL6/c;J)LL6/e;

    .line 10
    .line 11
    .line 12
    sget-object v0, LY2/f;->c:LL6/c;

    .line 13
    .line 14
    iget-wide v1, p1, Lb3/f;->b:J

    .line 15
    .line 16
    invoke-interface {p2, v0, v1, v2}, LL6/e;->f(LL6/c;J)LL6/e;

    .line 17
    .line 18
    .line 19
    return-void
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
