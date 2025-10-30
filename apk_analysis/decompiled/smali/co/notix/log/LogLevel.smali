.class public final enum Lco/notix/log/LogLevel;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/notix/log/LogLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/notix/log/LogLevel;

.field public static final enum ERROR:Lco/notix/log/LogLevel;

.field public static final enum FULL:Lco/notix/log/LogLevel;

.field public static final enum IMPORTANT:Lco/notix/log/LogLevel;

.field public static final enum NONE:Lco/notix/log/LogLevel;


# direct methods
.method private static final synthetic $values()[Lco/notix/log/LogLevel;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lco/notix/log/LogLevel;

    sget-object v1, Lco/notix/log/LogLevel;->NONE:Lco/notix/log/LogLevel;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lco/notix/log/LogLevel;->ERROR:Lco/notix/log/LogLevel;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lco/notix/log/LogLevel;->IMPORTANT:Lco/notix/log/LogLevel;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lco/notix/log/LogLevel;->FULL:Lco/notix/log/LogLevel;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/notix/log/LogLevel;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/notix/log/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/notix/log/LogLevel;->NONE:Lco/notix/log/LogLevel;

    new-instance v0, Lco/notix/log/LogLevel;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/notix/log/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/notix/log/LogLevel;->ERROR:Lco/notix/log/LogLevel;

    new-instance v0, Lco/notix/log/LogLevel;

    const-string v1, "IMPORTANT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lco/notix/log/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/notix/log/LogLevel;->IMPORTANT:Lco/notix/log/LogLevel;

    new-instance v0, Lco/notix/log/LogLevel;

    const-string v1, "FULL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lco/notix/log/LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/notix/log/LogLevel;->FULL:Lco/notix/log/LogLevel;

    invoke-static {}, Lco/notix/log/LogLevel;->$values()[Lco/notix/log/LogLevel;

    move-result-object v0

    sput-object v0, Lco/notix/log/LogLevel;->$VALUES:[Lco/notix/log/LogLevel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lco/notix/log/LogLevel;
    .locals 1

    const-class v0, Lco/notix/log/LogLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/notix/log/LogLevel;

    return-object p0
.end method

.method public static values()[Lco/notix/log/LogLevel;
    .locals 1

    sget-object v0, Lco/notix/log/LogLevel;->$VALUES:[Lco/notix/log/LogLevel;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/notix/log/LogLevel;

    return-object v0
.end method


# virtual methods
.method public final isGreaterOrEqual$sdk_release(Lco/notix/log/LogLevel;)Z
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-lt v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
