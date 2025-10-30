.class public final enum Lco/notix/sb;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lco/notix/sb;

.field public static final enum b:Lco/notix/sb;

.field public static final enum c:Lco/notix/sb;

.field public static final synthetic d:[Lco/notix/sb;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lco/notix/sb;

    .line 2
    .line 3
    const-string v1, "NOT_CALLED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lco/notix/sb;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lco/notix/sb;->a:Lco/notix/sb;

    .line 10
    .line 11
    new-instance v1, Lco/notix/sb;

    .line 12
    .line 13
    const-string v3, "INITIALIZING"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lco/notix/sb;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lco/notix/sb;->b:Lco/notix/sb;

    .line 20
    .line 21
    new-instance v3, Lco/notix/sb;

    .line 22
    .line 23
    const-string v5, "SUCCESS"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lco/notix/sb;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lco/notix/sb;->c:Lco/notix/sb;

    .line 30
    .line 31
    new-instance v5, Lco/notix/sb;

    .line 32
    .line 33
    const-string v7, "FAILURE"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lco/notix/sb;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    const/4 v7, 0x4

    .line 40
    new-array v7, v7, [Lco/notix/sb;

    .line 41
    .line 42
    aput-object v0, v7, v2

    .line 43
    .line 44
    aput-object v1, v7, v4

    .line 45
    .line 46
    aput-object v3, v7, v6

    .line 47
    .line 48
    aput-object v5, v7, v8

    .line 49
    .line 50
    sput-object v7, Lco/notix/sb;->d:[Lco/notix/sb;

    .line 51
    .line 52
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/notix/sb;
    .locals 1

    const-class v0, Lco/notix/sb;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/notix/sb;

    return-object p0
.end method

.method public static values()[Lco/notix/sb;
    .locals 1

    sget-object v0, Lco/notix/sb;->d:[Lco/notix/sb;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/notix/sb;

    return-object v0
.end method
