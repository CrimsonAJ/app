.class public final enum Lco/notix/callback/NotixCallbackStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lco/notix/callback/NotixCallbackStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lco/notix/callback/NotixCallbackStatus;

.field public static final enum FAILURE:Lco/notix/callback/NotixCallbackStatus;

.field public static final enum SUCCESS:Lco/notix/callback/NotixCallbackStatus;


# direct methods
.method private static final synthetic $values()[Lco/notix/callback/NotixCallbackStatus;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lco/notix/callback/NotixCallbackStatus;

    sget-object v1, Lco/notix/callback/NotixCallbackStatus;->SUCCESS:Lco/notix/callback/NotixCallbackStatus;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lco/notix/callback/NotixCallbackStatus;->FAILURE:Lco/notix/callback/NotixCallbackStatus;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/notix/callback/NotixCallbackStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lco/notix/callback/NotixCallbackStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/notix/callback/NotixCallbackStatus;->SUCCESS:Lco/notix/callback/NotixCallbackStatus;

    new-instance v0, Lco/notix/callback/NotixCallbackStatus;

    const-string v1, "FAILURE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lco/notix/callback/NotixCallbackStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lco/notix/callback/NotixCallbackStatus;->FAILURE:Lco/notix/callback/NotixCallbackStatus;

    invoke-static {}, Lco/notix/callback/NotixCallbackStatus;->$values()[Lco/notix/callback/NotixCallbackStatus;

    move-result-object v0

    sput-object v0, Lco/notix/callback/NotixCallbackStatus;->$VALUES:[Lco/notix/callback/NotixCallbackStatus;

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

.method public static valueOf(Ljava/lang/String;)Lco/notix/callback/NotixCallbackStatus;
    .locals 1

    const-class v0, Lco/notix/callback/NotixCallbackStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lco/notix/callback/NotixCallbackStatus;

    return-object p0
.end method

.method public static values()[Lco/notix/callback/NotixCallbackStatus;
    .locals 1

    sget-object v0, Lco/notix/callback/NotixCallbackStatus;->$VALUES:[Lco/notix/callback/NotixCallbackStatus;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lco/notix/callback/NotixCallbackStatus;

    return-object v0
.end method
